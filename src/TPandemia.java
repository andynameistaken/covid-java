import java.io.IOException;

public class TPandemia extends TProces
{
  private double srednia_zachorowan;

    public TPandemia() throws IOException {
        new TBufor("Bufor").getDaily_cases().forEach(a -> this.add(new TZachorowania("Zachorowanie nr:" + a, a)));
        int total_cases =
                this.getListaCzynnosci()
                        .stream()
                        .map(tCzynnosc -> (TZachorowania) tCzynnosc).mapToInt(TZachorowania::getZachorowania).sum();
        this.srednia_zachorowan = total_cases / (double) this.getLiczbaCzynnosci();
        System.out.println(srednia_zachorowan);
    }

    public double getSrednia_zachorowan()
    {
        return srednia_zachorowan;
    }
}

