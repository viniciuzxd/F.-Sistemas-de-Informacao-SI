<?php 

$n = [];
$soma=0;
for($i=0;$i<5;$i++){
    $n[$i] = readline("Digite o numero: ");
    $soma += $n[$i];
}

for($i = count($n) - 1; $i >= 0; $i--){
    echo "numero: $n[$i]\n";
}

echo "Soma: $soma";