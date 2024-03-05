class BitwiseOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
       
        System.out.println( x & y);
        System.out.println( x | y);
        System.out.println( x ^ y);
        System.out.println( x << y);
        //signed right shift operator if we give negative number than it reamins negative and if we give positivr number it reamins posititv with signed right shift
        System.out.println( y >> 2);
        System.out.println(~ y);

       

        //unsigned right shift with these if we give negative number than it will append 0 in the begin and the negative number positive
        System.out.println(-2 >>> 2);
    }
}