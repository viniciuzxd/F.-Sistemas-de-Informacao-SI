<?php 

$nomes = [];

for($i=0;$i < 5;$i++){
    $nomes[$i] = readline("Digite o nome: ");
}

for ($i= count($nomes) - 1; $i >=0 ; $i--) { 
    echo "Nome: $nomes[$i]\n";
}




