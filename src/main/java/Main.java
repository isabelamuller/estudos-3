public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        String[] names = new String[7];

        int count = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                System.out.println(element + " ta no " + count);
            }
                count++;
            }
        }
    }
// basicamente aqui mostrou qual index ta cada numero par (count % 2! = 0) no caso o % 2 podia ser qlqr numero que
// dividido pelo numero dps do % iguala a zero. dai se tu rodar o bag com != vai aparecer os q NAO sao divisiveis
// e q restam 0, mas se quer q apareca os q sao de fato eh so tirar o ! e meter ==