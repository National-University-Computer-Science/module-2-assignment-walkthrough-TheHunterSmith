public class MidtermPatterns {

      public void triangleA(int size) {
         for (int i = 1; i <= size; i++) {
              for (int j = 1; j <= i; j++) {
                 System.out.print('*');
             }
             System.out.println();
         }
      }
    
    public void triangleB(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                 System.out.print('*');
              }
            System.out.println();
         }
     }

     public void triangleC(int size) {
        for(int i = size; i >= 1; i--) {
            for(int j = size; j > i; j--) {
                System.out.print(' ');
}

        for(int k = 1; k <= i; k++) {
            System.out.print('*');
}

    System.out.println();
}
    System.out.println();
    }

    public void triangleD(int size) {
        for(int i = size; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(' ');
}

        for(int k = size; k >= i; k--) {
            System.out.print('*');

            System.out.println();}
        }
    }
}