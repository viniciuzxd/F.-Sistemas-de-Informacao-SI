<?php 

$numeros = [32,2, 32, 33, 100, 101, 100, 33];

$numero = readline("Digite o numero: ");
$quantidade = 0;

for ($i=0; $i < count($numeros); $i++) { 
    if($numeros[$i] == $numero){
        $quantidade++;
    }
}

if($quantidade > 0){
    echo "O número $numero está no array e repete $quantidade de vezes";
}else{
    echo "O numero $numero não stá no array";
}
