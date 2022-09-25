# RAPPORT TP1 RAMOS LUIS

## Exercice 1 - Hello Groland
1.  Écrire le programme suivant :
    
          public class HelloGroland {
            public static void main(String[] args) {
              System.out.println("Hello Groland");
            }
          }
         
    
    dans votre éditeur de texte préféré et sauvegarder celui-ci sous le nom  HelloGroland.java
2.  Compiler le programme en utilisant le commande  javac  puis vérifier que le fichier  .class  correspondant existe bien.
    
          javac HelloGroland.java
         
    
3.  Exécuter le programme avec la commande  java
    
          java HelloGroland
         
    
    On ne met pas ".class" parce que la machine virtuelle le rajoute toute seule.

Note : la commande java est aussi capable de compiler en mémoire si on lui indique un seul fichier simple, comme par exemple java HelloGrand.java. Dans ce cas, le fichier .class ne sera pas visible sur le disque car la compilation à lieu uniquement en mémoire.

##### R : Cf fichier HelloGroland.java

## Exercice 2 - Afficher les arguments de la ligne de commande
Écrire une classe  PrintArgs  qui affiche les arguments de la ligne de commande.

      $ java PrintArgs Voici des arguments
      Voici
      des
      arguments
    

Les arguments de la ligne de commande sont stockés dans le tableau de chaînes de caractères passé en argument à la méthode :  public static void main(String[] args).
1.  Dans un premier temps, afficher le premier argument de la ligne de commande (dans notre exemple  Voici).  
    Que se passe-t-il si l'on ne passe pas d'argument lors de l'exécution du programme ?
##### R : Lorsqu'on ne donne aucun argument au programme celui-ci n'affiche rien
2.  Écrire une boucle affichant le contenu du tableau, sachant qu'en Java, les tableaux possèdent un champ (un attribut)  length  qui correspond à la taille du tableau.
##### R : On utilise la méthode length pour connaitre la taille du tableau à parcourir avec une boucle for(i = 0; i < array.lenght; i++){
3.  Changer votre programme pour utiliser la syntaxe dite du 'for deux points', c'est à dire  for(Type value: array)
##### R : On parcourt chaque élément de type String dans le tableau avec un boucle for(String i : array) {

## Exercice 3 - Calculette simple
Écrire un programme prenant un nombre sur l'entrée standard et affichant celui-ci.  
Pour cela, on utilisera un objet Scanner et particulièrement sa méthode nextInt().

    import java.util.Scanner; 

    public class Calc { 
    	public static void main(String[] args) {
    		Scanner scanner;
    		scanner = new Scanner(System.in);
    		int value;
    		value = scanner.nextInt();
    		// completer ici
    	}
    }
    

Pour comprendre le programme, il est utile de regarder la documentation [disponible](https://docs.oracle.com/en/java/javase/19/docs/api/). Il est fortement conseillé de mettre ce lien en _bookmark_ (signet, favoris, etc.)
1.  Recopier le programme précédent et le compléter pour qu'il affiche le nombre saisi par l'utilisateur.
##### R : Cf fichier Calc.java
2. Indiquer dans le programme où sont les variables et quel est leur type associé.  
Modifier le programme pour déclarer et initialiser les variables en une seule ligne
##### R : Les variables sont scanner de type de scanner, value et val de type int et args de type String[]
3.  Pourquoi  nextInt()  n'est pas une fonction ?  
    Qu'est  nextInt()  alors ?
##### R : nextInt est une méthode de la classe Scanner
4. Expliquer la ligne :

    import java.util.Scanner;
##### R : Cette ligne sers à raccourcir le code plutôt qu'utiliser java.util.Scanner à chaque fois qu'on souhaite utiliser un scanner
5. Modifier le programme pour qu'il demande deux entiers et affiche la somme de ceux-ci.
##### R : Cf fichier Calc.java
6. Afficher en plus de la somme, la différence, le produit, le quotient et le reste.
##### R : Cf fichier Calc.java


## Exercice 4 - Record et conversion de String en entier
On souhaite écrire un programme calculant la distance entre deux points, ou plus exactement la distance entre un point et l'origine, i.e. le point de coordonnées (0,0).  
Voici un exemple d'exécution que l'on souhaite obtenir :

      $ java Point 3 4
      x=3, y=4
      Point[x=3, y=4]
      dist = 5.0
1.  Dans un premier temps, créer un  record  Point  (dans un fichier  Point.java) avec deux composants  x  et  y, tous les deux de type  int.  
    Quelle doit être la ligne de commande pour compiler le fichier  Point.java  ?
##### R :   La ligne de commande pour compiler le fichier Point.Java est javac Point.java
2.  Écrire une méthode  main  qui prend les entiers  x  et  y  sur la ligne de commande (3 et 4 dans l'exemple ci-dessus), les convertit en valeurs entières et affiche celles-ci (la ligne  x=3, y=4  dans l'exemple).  
    Note : La méthode statique  parseInt(String s)  de la classe  java.lang.Integer  permet de récupérer la valeur d'un entier stockée dans une chaîne de caractères.
##### R : Cf fichier Test.java
3.  Que veut dire ``static'' pour une méthode ?
##### R : Une méthode statique n'est utilisable que sur un objet existant d'une même classe alors qu'une méthode statique peut être utilisée dans une autre classe.
5.  Que se passe-t-il lorsque l'un des arguments n'est pas un nombre ?
##### R : Lorsque le programme reçoit un argument autre qu'un entier il y a une erreur
6.  Dans le  main, ajouter des instructions pour créer un instance du record  Point, avec le deux entiers  x  et  y  et afficher celui-ci.
##### R : Cf fichier Test.java
7.  On souhaite ajouter au record  Point  une méthode d'instance (une méthode non statique) nommée  distance  qui calcule la distance entre deux points sous forme d'un nombre à virgule flottante.  
    Quels sont les paramètres et le type de retour de la méthode  distance  ?  
    Sachant que calculer la distance entre deux points est équivalent à utiliser Pythagore sur la distance en x et la distance en y entre les deux points et qu'il existe une méthode statique  Math.sqrt  qui renvoie la racine carrée d'un nombre, écrire la méthode  distance  et afficher dans le  main  la distance entre le point (x, y) et un point à l'origine (0, 0).
##### R : Le prototype de la fonction distance est double distance(Point B)

## Exercice 5 - De C vers Java
Cet exemple a pour but de montrer les différences de performances entre un programme en C et le même en Java.

  

[![](http://igm.univ-mlv.fr/ens/resources/file.png)](https://monge.univ-mlv.fr/ens/Licence/L3/2022-2023/Java/src/td01-pascal.c)

1.  Compiler (gcc pascal.c)  et exécuter le programme  a.out  en demandant au système le temps d'exécution du programme.  (time a.out).
##### R :  Le C s'éxécute en
 <pre>
real	0m0,891s
user	0m0,885s
sys     0m0,004s
 </pre>
2.  Écrire le programme (Pascal.java) équivalent en Java. Pour une fois, servez-vous du copier/coller. Compiler le programme puis l'exécuter en mesurant le temps (toujours avec  time).
##### R : Le Java s'éxécute en
 <pre>
real	0m0,210s
user	0m0,178s
sys	    0m0,025s
</pre>
 
 3. Comment peut-on expliquer la différence de vitesse ?
##### R :  Cela s'explique par le fait que lors de la compilation du C on ne mets aucune balise d'optimisation. Mais lorsqu'on ajoute ces options le temps de compilation augmente.
