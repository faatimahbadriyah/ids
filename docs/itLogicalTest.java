public class itLogicalTest {
    public static void main(String[] args){
        int iSatu, iDua, iTiga, iEmpat, iLima;
        iDua = 0;
        iTiga = 0;
        iEmpat = 0;
        iLima = 0;

        int no2A = 0;
        String no2B = "";
        int no3A = 0;
        int no3B = 0;
        String no4A = "";
        String no4B = "";

        for (iSatu = 0; iSatu < 10; iSatu++) {

            if (iSatu % 4 == 0) {
                iDua = iDua + iSatu + iTiga - iLima;
                no2A++;
                no2B += iSatu + ",";
            }

            if (iSatu % 3 == 0) {
                if (no3A == 2) {
                    no3B = iEmpat;
                }
                iTiga = iTiga + (iSatu + iDua) - iEmpat;
                no3A++;
            }

            if (iSatu % 2 == 0) {
                iEmpat = iEmpat + (iSatu + iDua) - iTiga;
            }

            if (iSatu % 1 == 0) {
                iLima = iSatu + iDua + iTiga;
            }

            if (iTiga < 0) {
                no4A += iSatu + ",";
                no4B += iTiga + ",";
            }
            
        }

        System.out.println("No 1. Nilai akhir: ");
        System.out.println("iSatu :" + iSatu);
        System.out.println("iDua :" + iDua);
        System.out.println("iTiga :" + iTiga);
        System.out.println("iEmpat :" + iEmpat);
        System.out.println("iLima :" + iLima);

        System.out.println("No 2a. " + no2A);
        System.out.println("No 2b. " + no2B);

        System.out.println("No 3a. " + no3A);
        System.out.println("No 3b. " + no3B);

        System.out.println("No 4a. " + no4A);
        System.out.println("No 4b. " + no4B);
    }
}
