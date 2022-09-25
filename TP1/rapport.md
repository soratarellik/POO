# RAPPORT

## Exercice 1
Cf fichier HelloGroland.java

## Exercice 2
1) Lorsqu'on ne donne aucun argument au programme celui-ci n'affiche rien
2) on utilise la méthode length pour connaitre la taille du tableau à parcourir
3) On parcourt chaque élément de type String dans le tableau avec un boucle for(String i : array)

## Exercice 3
1) Cf fichier Calc.java
2) Les variables sont scanner de type de scanner, value de type int et args de type String[]
3) nextInt est une méthode et pas une fonction. 
4) Cette ligne sers à raccourcir le code plutôt qu'utiliser java.util.Scanner à chaque fois qu'on souhaite utiliser un scanner
5) Cf fichier Calc.java
6) Cf fichier Calc.java


## Exercice 4
1) La ligne de commande pour compiler le fichier Point.Java est javac Point.java
2) Cf fichier Test.java
3) Une méthode statique n'est utilisable que sur un objet existant d'une même classe alors qu'une méthode statique peut être utilisée dans une autre classe.
4) Lorsque le programme reçoit un argument autre qu'un entier il y a une erreur
5) Cf fichier Test.java
6) Le prototype de la fonction distance est double distance(Point B)

## Exercice 5
 Le C s'éxécute en
 <pre>
real	0m0,891s
user	0m0,885s
sys     0m0,004s
 </pre>
 
 et le Java s'éxécute en
 <pre>
real	0m0,210s
user	0m0,178s
sys	    0m0,025s
</pre>

Soit 4x fois plus vite que le C lors de cet exercice. Cela s'explique par le fait que lors de la compilation du C on ne mets aucune balise d'optimisation. Mais lorsqu'on ajoute ces options le temps de compilation augmente.