import java.util.List;
import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TBufor loads *.csv files
 * */
public class TBufor extends TCzynnosc {
    private List<Integer> daily_cases;

    TBufor(String arg1) throws IOException {
        super(arg1);
        getCSV();
        this.addCases();

    }

    private static void getCSV() throws IOException {
        if (!Files.exists(Paths.get("./covid_cases.csv"))) {
            ReadableByteChannel readChannel = Channels.newChannel(
                    new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv")
                            .openStream());
            FileOutputStream fileOS = new FileOutputStream("covid_cases.csv");
            FileChannel writeChannel = fileOS.getChannel();
            writeChannel.transferFrom(readChannel, 0, Long.MAX_VALUE);
            /*

        transferFrom   Params:
                src – The source channel
                position – The position within the file at which the transfer is to begin; must be non-negative
                count – The maximum number of bytes to be transferred; must be non-negative
            */


        } else System.out.println("covid_cases.csv already exists");

    }

    public List<Integer> getDaily_cases() {
        return daily_cases;
    }

    private void addCases() throws IOException {
        Path covid_path = Paths.get("./covid_cases.csv");
        if (Files.exists(covid_path)) {
            List<String> header =
                    Arrays.asList(Files                 // create an arraylist from this array:
                            .lines(covid_path) // read lines
                            .findFirst() // find first element
                            .map(s -> s.split(",")) // split by "," and put to array
                            .orElse(new String[0]) // or return empty array
                    );
            this.daily_cases =
                    Files.lines(covid_path)
                            .skip(1) // skip first element
                            .map(s -> s.split(","))// split strings by "," and for an array
                            .filter(strArr -> strArr[header.indexOf("countriesAndTerritories")].contains("Poland")) // filter to get cases in Poland
                            .map(s -> Integer.parseInt(s[header.indexOf("cases")])).collect(Collectors.toList()); // put it to list

        }


    }
}
