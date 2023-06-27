package prva.nedelja.vezbanje;

public class HM_GM_AM {

    public static void main(String[] args) {

        //3.HM GM AM
        //Ucitelj Marko zeli da oceni svoje djake sto je to bolje moguce i ne moze da se
        //opredeli koju sredinu da koristi pri racunanju proseka; Aritmeticku koju i svi koriste
        //ili ipak Harmonijsku ili Geometrijsku.
        //Napisati program koji za dati niz ocena ispisivati poruku koja sredina daje najbolji
        //(najveci) prosek. Sredine se racunaju na sledeci nacin:

        //-Neka je n broj tih brojeva

        //1.Aritmeticka
        //Standardno - zbir svih brojeva / n

        //2. Harmonijska
        //Odnos n-a i zbira recipronih vrednosti tih brojeva

        //3. Geometrijska
        //n-ti koren proizvoda svih brojeva

        //(Za racunanje n-tog korena nekog broja x koristiti Math.pow(x, 1/n); instrukciju)

        //U slucaju da neke dve sredine daju istu najvecu srednju vrednost tada prednost ima:
        //"AM", pa zatim "GM", pa zatim "HM" sredina

        //UKoliko sve tri sredine daju istu srednju vrednost tada ispisati "AM"
        //------------------------------------------------------------------------------------
        //Primer 1
        //Input:
        //5
        //1 2 3 4 5
        //Output:
        //"AM"
        ///*Jer je
        //AM = (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3.0
        //HM =  5 / (1/1 + 1/2 + 1/3 + 1/4 + 1/5) = 2.189
        //GM = (1 * 2 * 3 * 4 * 5)^(1/5) = 120^(1/5) = 2.6
        //Pa AM daje najbolji prosek
        //*/
        //Primer 2
        //Input:
        //3
        //2 2 2
        //Output:
        //AM
        ///*Jer je
        //AM = (2 + 2 + 2) / 3 = 6 / 3 = 2
        //HM = 3 / (1/2 + 1/2 + 1/2) = 3 / (3/2) = 3*2/3 = 2
        //GM = (2 * 2 * 2)^(1/3) = 8^(1/3) = 2

        //Pa smo rekli da u tom slucaju AM ima prednost u odnosu na druge dve

    }
}
