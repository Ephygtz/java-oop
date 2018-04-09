public class QueryRate {
    public static void main(String[] args) {
        Equity equity = new Equity();
        Kcb kcb = new Kcb();
        Cba cba = new Cba();

        System.out.println("Equity interest rates : " + equity.getRateOfInterest());
        System.out.println("KCB interest rates : " + kcb.getRateOfInterest());
        System.out.println("CBA interest rates : " + cba.getRateOfInterest());
    }
}
