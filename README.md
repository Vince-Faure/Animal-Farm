# Animal-Farm
- **1 : Les animaux de la ferme**
    
    Dans cet exercice, vous allez créer une application simple qui modélise quelques animaux dans une ferme. Voici les détails :
    
    1. Créez une classe **`Animal`** qui contient :
        - Un attribut privé **`nom`** de type String.
        - Un constructeur qui prend un argument String pour initialiser le **`nom`** de l'animal.
        - Une méthode **`getNom()`** qui renvoie le nom de l'animal.
        - Une méthode **`faireDuBruit()`** qui affiche un message indiquant que l'animal fait du bruit. Par exemple, elle pourrait afficher "L'animal fait du bruit".
    2. Créez une classe **`Vache`** qui hérite de **`Animal`** :
        - Elle doit avoir une méthode **`faireDuBruit()`** qui affiche "La vache dit Meuh !".
    3. Créez une classe **`Canard`** qui hérite aussi de **`Animal`** :
        - Elle doit avoir une méthode **`faireDuBruit()`** qui affiche "Le canard dit Coin !".
    4. Enfin, dans votre méthode **`main()`**, créez un tableau d'**`Animal`**, y ajoutez quelques **`Vache`** et **`Canard`**, puis parcourez le tableau en appelant la méthode **`faireDuBruit()`** de chaque animal.
    
    Cet exercice illustre le concept d'héritage (la **`Vache`** et le **`Canard`** héritent de **`Animal`**) et le polymorphisme (la méthode **`faireDuBruit()`** est définie différemment pour la **`Vache`** et le **`Canard`**, mais on peut les appeler de manière polymorphique à travers une référence à **`Animal`**).
