class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

//    public boolean equals(Object obj){
//        if (this == obj)
//            return true;
//        if (!(obj instanceof ComplexNumber))
//            return false;
//
//        ComplexNumber that = (ComplexNumber) obj;
//        return this.re == that.re
//                && this.im == that.im;
//    }
//
//    public int hashCode(){
//        int result = 17;
//        result = 31 * result + ((int) Math.pow(Double.doubleToLongBits(re), Double.doubleToLongBits(re) >>> 32));
//        result = 31 * result + ((int) Math.pow(Double.doubleToLongBits(im), Double.doubleToLongBits(im) >>> 32));
//        return result;
//    }
}