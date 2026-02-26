# Guia de Criação do Frontend Angular - Exchange API

## 📦 Pré-requisitos

### 1. Instalar Node.js
- Baixe em: https://nodejs.org/
- Versão recomendada: LTS (Long Term Support)
- Após instalar, reinicie o terminal

### 2. Verificar instalação
```powershell
node --version
npm --version
```

### 3. Instalar Angular CLI
```powershell
npm install -g @angular/cli
```

### 4. Verificar Angular CLI
```powershell
ng version
```

---

## 🚀 Criando o Projeto Angular

### 1. Criar novo projeto
```powershell
# Navegue até o diretório pai do ExchangeApi-main
cd "C:\Users\Pichau\OneDrive\Documentos\Programação\F. Sistemas de Informação (SI)\Programação (I à IV)\ExchangeApi-main"

# Crie o projeto Angular
ng new exchange-frontend
```

**Opções:**
- Would you like to add Angular routing? → **Y** (Sim)
- Which stylesheet format? → **CSS** (ou sua preferência)

### 2. Entrar no projeto
```powershell
cd exchange-frontend
```

### 3. Instalar dependências adicionais (Bootstrap para estilização)
```powershell
npm install bootstrap
```

---

## 📁 Estrutura a ser criada

### 1. Criar modelo de dados
```powershell
ng generate interface models/quote-details
```

Editar `src/app/models/quote-details.ts`:
```typescript
export interface QuoteDetails {
  code: string;
  codein: string;
  name: string;
  high: string;
  low: string;
  varBid: string;
  pctChange: string;
  bid: string;
  ask: string;
  timestamp: string;
  create_date: string;
}
```

### 2. Criar serviço para API
```powershell
ng generate service services/exchange
```

Editar `src/app/services/exchange.service.ts`:
```typescript
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { QuoteDetails } from '../models/quote-details';

@Injectable({
  providedIn: 'root'
})
export class ExchangeService {
  private apiUrl = 'http://localhost:8080/api/v1/conversions';

  constructor(private http: HttpClient) { }

  getConversion(from: string, to: string): Observable<QuoteDetails> {
    return this.http.get<QuoteDetails>(`${this.apiUrl}/${from}/${to}`);
  }
}
```

### 3. Criar componente principal
```powershell
ng generate component components/currency-converter
```

Editar `src/app/components/currency-converter/currency-converter.component.ts`:
```typescript
import { Component } from '@angular/core';
import { ExchangeService } from '../../services/exchange.service';
import { QuoteDetails } from '../../models/quote-details';

@Component({
  selector: 'app-currency-converter',
  templateUrl: './currency-converter.component.html',
  styleUrls: ['./currency-converter.component.css']
})
export class CurrencyConverterComponent {
  fromCurrency: string = 'USD';
  toCurrency: string = 'BRL';
  quoteDetails?: QuoteDetails;
  loading: boolean = false;
  error: string = '';

  currencies = [
    { code: 'USD', name: 'Dólar Americano' },
    { code: 'EUR', name: 'Euro' },
    { code: 'BRL', name: 'Real Brasileiro' },
    { code: 'GBP', name: 'Libra Esterlina' },
    { code: 'JPY', name: 'Iene Japonês' }
  ];

  constructor(private exchangeService: ExchangeService) {}

  getConversion(): void {
    this.loading = true;
    this.error = '';
    
    this.exchangeService.getConversion(this.fromCurrency, this.toCurrency)
      .subscribe({
        next: (data) => {
          this.quoteDetails = data;
          this.loading = false;
        },
        error: (err) => {
          this.error = 'Erro ao buscar cotação. Tente novamente.';
          this.loading = false;
          console.error(err);
        }
      });
  }
}
```

Editar `src/app/components/currency-converter/currency-converter.component.html`:
```html
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-8">
      <div class="card shadow">
        <div class="card-header bg-primary text-white">
          <h3 class="mb-0">💱 Conversor de Moedas</h3>
        </div>
        <div class="card-body">
          <form (ngSubmit)="getConversion()">
            <div class="row mb-3">
              <div class="col-md-6">
                <label class="form-label">De:</label>
                <select class="form-select" [(ngModel)]="fromCurrency" name="fromCurrency">
                  <option *ngFor="let currency of currencies" [value]="currency.code">
                    {{ currency.name }} ({{ currency.code }})
                  </option>
                </select>
              </div>
              <div class="col-md-6">
                <label class="form-label">Para:</label>
                <select class="form-select" [(ngModel)]="toCurrency" name="toCurrency">
                  <option *ngFor="let currency of currencies" [value]="currency.code">
                    {{ currency.name }} ({{ currency.code }})
                  </option>
                </select>
              </div>
            </div>
            
            <button type="submit" class="btn btn-primary w-100" [disabled]="loading">
              <span *ngIf="loading" class="spinner-border spinner-border-sm me-2"></span>
              {{ loading ? 'Buscando...' : 'Buscar Cotação' }}
            </button>
          </form>

          <div *ngIf="error" class="alert alert-danger mt-3">
            {{ error }}
          </div>

          <div *ngIf="quoteDetails" class="mt-4">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">{{ quoteDetails.name }}</h5>
                <div class="row">
                  <div class="col-md-6">
                    <p><strong>Compra:</strong> {{ quoteDetails.bid }}</p>
                    <p><strong>Venda:</strong> {{ quoteDetails.ask }}</p>
                    <p><strong>Máxima:</strong> {{ quoteDetails.high }}</p>
                  </div>
                  <div class="col-md-6">
                    <p><strong>Mínima:</strong> {{ quoteDetails.low }}</p>
                    <p><strong>Variação:</strong> {{ quoteDetails.varBid }}</p>
                    <p><strong>% Mudança:</strong> {{ quoteDetails.pctChange }}%</p>
                  </div>
                </div>
                <p class="text-muted mb-0">
                  <small>Atualizado em: {{ quoteDetails.create_date }}</small>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
```

### 4. Configurar app.module.ts
Editar `src/app/app.module.ts`:
```typescript
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CurrencyConverterComponent } from './components/currency-converter/currency-converter.component';

@NgModule({
  declarations: [
    AppComponent,
    CurrencyConverterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```

### 5. Atualizar app.component.html
Substituir todo o conteúdo de `src/app/app.component.html`:
```html
<app-currency-converter></app-currency-converter>
```

### 6. Adicionar Bootstrap no angular.json
No arquivo `angular.json`, adicionar na seção `styles`:
```json
"styles": [
  "node_modules/bootstrap/dist/css/bootstrap.min.css",
  "src/styles.css"
]
```

---

## ▶️ Executando o Projeto

### 1. Iniciar o backend Spring Boot
```powershell
# No diretório do ExchangeApi-main
./mvnw.cmd spring-boot:run
```
Backend rodará em: http://localhost:8080

### 2. Iniciar o frontend Angular
```powershell
# No diretório exchange-frontend
ng serve
```
Frontend rodará em: http://localhost:4200

### 3. Acessar no navegador
Abra: http://localhost:4200

---

## 🎯 Próximos Passos

1. **Melhorias visuais**: Adicionar mais estilos CSS
2. **Validações**: Validar entradas do usuário
3. **Histórico**: Salvar histórico de conversões
4. **Gráficos**: Adicionar gráficos de tendências (usando Chart.js ou similar)
5. **Responsividade**: Melhorar para dispositivos móveis

---

## 🐛 Troubleshooting

### Erro de CORS
- Verifique se o arquivo `CorsConfig.java` foi criado corretamente no backend
- Certifique-se de que o backend está rodando

### Erro ao buscar cotação
- Verifique se a URL da API está correta no `exchange.service.ts`
- Confirme que o backend está respondendo em http://localhost:8080

### Erro de módulo
- Execute: `npm install` no diretório do projeto Angular

---

## 📚 Recursos Úteis

- Documentação Angular: https://angular.io/docs
- Bootstrap: https://getbootstrap.com/docs/
- TypeScript: https://www.typescriptlang.org/docs/

---

**Criado em:** 15 de outubro de 2025
**Backend:** Spring Boot 3.5.6 + Java 21
**Frontend:** Angular (última versão)
