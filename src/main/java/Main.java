import somepackage.Some;
import somethinggreen.Contract;

public class Main {
    public static void main(String[] args) {

        Some some = new Some("secret");
        System.out.println(some.noMoreSecrets);
        System.out.println(some.getДаТакТожеМожно());
        Contract.staticMethod("это статик метод интерфейса");
        System.out.println(some.count());
        System.out.println(some.getNoMoreSecrets());
        System.out.println(some.toString());
        System.out.println(some.getSecret());
        System.out.println(some.getSecret(true));
        System.out.println(some.hashCode());
        System.out.println(some.getClass());



    }
}
