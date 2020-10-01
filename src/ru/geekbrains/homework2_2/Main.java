package ru.geekbrains.homework2_2;

public class Main {

    public static void main(String[] args) throws Exception {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; //  Сумма\2=результат.
//      String s = "10 3 1 2\\n2 3 2 2\\n5 6 7 1\\n300 3 1 0";  //  Размер матрицы, полученной из строки - не равен 4x4.
//      String s = "10 R 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; //  Одна из ячеек матрицы не является числом.


        String[][] stringArr = sizeStringArr(s);
        System.out.println(outPUT(stringArr));
    }

    static double outPUT(String[][] s) {
        int TOTAL = 0;

        for (String[] stg1 : s) {
            for (String stg2 : stg1) {
                try {
                    TOTAL += Integer.parseInt(stg2);
                } catch (NumberFormatException e) {
                    System.out.println("Одна из ячеек матрицы не является числом.");
                    e.printStackTrace();
                    System.exit(666);
                }
            }
        }

        return TOTAL / 2;
    }

    static String[][] sizeStringArr(String s) throws Exception {
        String EXP = s + "\n";
        for (int i = 0, SPACE = 0, k = 0; i < EXP.length(); i++) {
            if (EXP.charAt(i) == ' ') SPACE++;
            if (EXP.charAt(i) == '\n') {
                if (SPACE == 3) SPACE = 0;
                else throw new Exception ("Размер матрицы, полученной из строки - не равен 4x4.");
            }
        }

        int LENGHTst = s.split("\n").length;
        String[][] result = new String[LENGHTst][LENGHTst];
        String[] CLEARn = s.split("\n");

        for (int i = 0; i < LENGHTst; i++) {
            String[] CLEARsp = CLEARn[i].split(" ");
            for (int j = 0; j < LENGHTst; j++) {
                result[i][j] = CLEARsp[j];
            }
        }

        return result;
    }

}


