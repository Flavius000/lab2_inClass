package repository;

import domain.Nota;
import org.joda.time.*;

public class NotaFileRepository extends AbstractFileRepository<String, Nota> {

    /**
     * Class constructor
     * @param filename - numele fisierului
     */
    public NotaFileRepository(String filename) {
        super( filename);
    }

    /**
     * Extrage informatia despre nota dintr-un string
     * @param line - stringul din care ia datele notei
     * @return nota
     */
    @Override
    public Nota extractEntity(String line) {
        String[] words = line.split(",");
        String[] data = words[3].split("-");
        LocalDate date = new LocalDate(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        return new Nota(words[0]+"#"+words[1], words[0], words[1], Double.parseDouble(words[2]), date);
    }
}
