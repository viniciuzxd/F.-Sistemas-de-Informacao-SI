<?php 

$paises = ["brasil", "chile", "argentina", "bolicia", "uruguai"];

$pais = readline("Digite o nome do pais: ");

$encontrou = false;

for($i=0;$i < count($paises); $i++){
    if($paises[$i] == $pais){
        echo "Pais $pais encontrado!";
        $encontrou = true;
        break;
    }
}

if($encontrou == false){
    echo "Pais $pais não encontrado!";
}