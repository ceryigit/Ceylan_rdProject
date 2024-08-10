import Ders6Odev.Maas;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class MaasTestDataProvider {
    @Test(dataProvider = "maasHesapla")
    public void testMaasHesapla(int gun, int beklenenMaas) {
        Maas maas = new Maas();
        int gercekMaas = maas.maasHesapla(gun);
        Assert.assertEquals(gercekMaas, beklenenMaas);
    }
    @DataProvider(name = "maasHesapla")
    public Object[][] maasVerileriSaglayici() {
        return new Object[][] {
                {25, 10000},
                {26, 11000},
                {30, 15000},
                {20, 10000}
        };
    }
}