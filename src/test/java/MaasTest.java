import Ders6Odev.Maas;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaasTest {

    @Test
    public void testMaasHesaplama() {
        Maas maas = new Maas();

        int hesaplananMaas1 = maas.maasHesapla(29);
        Assert.assertEquals(hesaplananMaas1, 14000);

        int hesaplananMaas2 = maas.maasHesapla(25);
        Assert.assertEquals(hesaplananMaas2, 10000);

        int hesaplananMaas3 = maas.maasHesapla(20);
        Assert.assertEquals(hesaplananMaas3, 10000);
    }
}