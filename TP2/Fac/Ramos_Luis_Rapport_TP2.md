# RAPPORT Ramos Luis TP2


### Exercice 1 - Assignation, égalité, référence

1.  On considère le code suivant :
    
            var s = "toto";
            System.out.println(s.length());

    
    Quel est le type de  s  ? Comment le compilateur fait-il pour savoir qu'il existe une méthode  length()  sur  s  ?
	   ##### R: s est une chaine de caractères
2.  Qu'affiche le code suivant ? Expliquer.
    
            var s1 = "toto";
            var s2 = s1;
            var s3 = new String(s1);
        
            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
       ##### R:   s1 et s2 partangent la même adresse donc sont identiques en tout point, s3 est un nouveau objet de type string qui n'a pas la même adresse que s2 et s1
    
3.  Quelle est la méthode à utiliser si l'on veut tester si le contenu des chaînes de caractères est le même ?
    
            var s4 = "toto";
            var s5 = new String(s4);
        
            System.out.println(/* comparer contenue de s4 et s5 */);
         
     ##### R: La méthode a utiliser est s4.equals(s5)
4.  Qu'affiche le code suivant ? Expliquer.
    
            var s6 = "toto";
            var s7 = "toto";
        
            System.out.println(s6 == s7);
         
     ##### R: Le code suivant affiche true
5.  Expliquer pourquoi il est important que  java.lang.String  ne soit pas mutable.
	##### R: Pour ne pas modifier le paramètre sans faire exprès, éviter les effets de bord
7.  Qu'affiche le code suivant ?
    
            var s8 = "hello";
            s8.toUpperCase();
            System.out.println(s8);
         
    
    Expliquer.
     ##### R: Le code affiche hello en minuscule. Les string étant non mutables pour afficher hello en majuscules il faudrait faire s8 = s8.toUpperCase()

### Exercice 2 - En morse. Stop.

Écrire une classe  Morse  qui permet, lors de son exécution, d'afficher les chaînes de caractères prises en argument séparées par des  "Stop.".

      $ java Morse ceci est drole
      ceci Stop. est Stop. drole Stop.
    

1.  Utiliser dans un premier temps l'opérateur  +  qui permet la concaténation de chaînes de caractères.
	 ##### R: Fait cf fichier Morse.java
2.  A quoi sert l'objet  java.lang.StringBuilder  ?  
    Pourquoi sa méthode  append(String)  renvoie-t-elle un objet de type  StringBuilder  ?
	 ##### R: La méthode renvoie un StringBuilder car ce type là est encore mutable donc il sera plus simple pour le changer que de devoir allouer de l'espace à une nouvelle chaîne partielle à chaque fois.
3.  Réécrire la classe  Morse  en utilisant un  StringBuilder.  
    Quel est l'avantage par rapport à la solution précédente ?
	 ##### R: éviter de faire des allocations à chaque tour de boucle comme on le ferait avec des +
4.  Recopier le code suivant dans une classe de  Test  :
    
           public static void main(String[] args) {
             var first = args[0];
             var second = args[1];
             var last = args[2];
             System.out.println(first + ' ' + second + ' ' + last);
           }
          
    
    Pourquoi peut-on utiliser  ' '  à la place de  " "  ? 
	 ##### R:  Parce que les ' ' représentent le caractère espace et non un objet de type String.
    Compiler le code puis utiliser la commande  javap  pour afficher  _le bytecode Java_  (qui n'est pas un assembleur) généré.
    
           javap -c Test
          
    
    Que pouvez-vous en déduire ?
5.  Compiler le code de la question 1, puis utiliser la commande  javap  pour afficher  _le bytecode Java_  généré.  
    Que pouvez-vous en déduire ?  
    Dans quel cas doit-on utiliser  StringBuilder.append()  plutôt que le  +  ? 
    ##### R: On utilisera plutôt StringBuildeur.append() lorsque la chaîne sera crée a travers une boucle.
    Et pourquoi est-ce que le chargé de TD va me faire les gros yeux si j'écris un  +  dans un appel à la méthode  append?
	 ##### R: Si on met un + dans les append(), on ajoute une allocation dans le append(), ce qui sera contreproductif dans l'efficacité du code produit et de son éxécution.


  

### Exercice 3 - Reconnaissance de motifs

Le but de cet exercice est la manipulation d'expressions régulières en java. Nous utiliserons pour cela les classes du paquetage  java.util.regex.

  

1.  A quoi servent la classe  java.util.regex.Pattern  et sa méthode  compile  ?  
    A quoi sert la classe  java.util.regex.Matcher  ?
     ##### R: java.util.regex.Pattern, et compile servent à créer des automates à partir d'une regex, java.util.regex.Matcher sers à vérifier si la chaine de caracteres est un état terminal de l'automate crée
2.  Écrire un programme qui lit des chaînes de caractères sur la ligne de commande et affiche les chaînes qui correspondent à des nombres, c'est-à-dire les chaînes dont tous les caractères sont compris entre '0' et '9'.
	##### R: Cf fichier Motifs.java
3.  Modifier le programme pour que l'on reconnaisse (et extrait) un nombre même dans le cas où le nombre est précédé par des caractères qui ne sont pas des chiffres.  
    Par exemple, les chaïnes "abc", "4de" et "f6h" ne sont pas valide car soit il n'y a pas de nombre soit elles ne finissent pas par un nombre. La chaïne "789" correspond au nombre 789 et la chaïne "ab3" correspond au nombre 3 (les caractères avant le nombre ne sont pas pris en compte).  
    Note: il y a plusieurs façon de faire, penser que  matches()  n'est pas la seule méthode qui existe sur un  Matcher.  
    Attention: on ve veut pas créer plusieurs  Pattern  différents, ou plusieurs  Matcher  différents (il y a plus simple).
	 ##### R: Cf fichier Motifs.java
4.  Écrire une méthode qui prend en paramètre une chaîne de caractères contenant une adresse IPv4 et renvoie un tableau de 4 bytes. Il faut tester qu'il s'agit bien d'une adresse valide.  Vous utiliserez pour cela la notion de groupe.
	 ##### R: Cf fichier Motifs.java fonction bytes[] toIPV4(String ip)


  

