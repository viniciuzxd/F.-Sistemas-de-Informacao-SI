# Script para criar a estrutura do projeto Angular
# Execute este script DEPOIS de criar o projeto com: ng new exchange-frontend

Write-Host "🚀 Criando estrutura do projeto Angular..." -ForegroundColor Cyan

# Criar modelo
Write-Host "`n📝 Criando modelo de dados..." -ForegroundColor Yellow
ng generate interface models/quote-details --skip-tests

# Criar serviço
Write-Host "`n🔧 Criando serviço..." -ForegroundColor Yellow
ng generate service services/exchange --skip-tests

# Criar componente
Write-Host "`n🎨 Criando componente..." -ForegroundColor Yellow
ng generate component components/currency-converter --skip-tests

Write-Host "`n✅ Estrutura criada com sucesso!" -ForegroundColor Green
Write-Host "`nAgora siga o guia GUIA_FRONTEND_ANGULAR.md para configurar os arquivos." -ForegroundColor Cyan
