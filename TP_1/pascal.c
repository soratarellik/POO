#include <stdio.h>
void main()
{
    int nbr, esp, i, j, p=1;
  
    printf("Entrez le nombre de lignes: ");
    scanf("%d",&nbr);
  
    for(i = 0; i < nbr; i++)
    {
        for(esp = 1; esp <= nbr-i; esp++)
        printf("  "); //ajouter l'espace
        for(j = 0; j <= i; j++)
        {
            if ( i==0 || j==0 )
                p = 1;
            else
               p = p*(i-j+1)/j;
            printf("% 4d",p);
        }
        printf("\n");
    }
}