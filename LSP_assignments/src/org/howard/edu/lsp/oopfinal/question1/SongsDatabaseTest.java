package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
        assertEquals(1, db.getSongs("Rap").size());

        db.addSong("Rap", "Gin and Juice");
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
        assertEquals(2, db.getSongs("Rap").size());
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unchained"));
    }

    @Test
    public void testGetSongsForGenre() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");

        Set<String> rapSongs = db.getSongs("Rap");
        assertNotNull(rapSongs);
        assertEquals(2, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));

        Set<String> countrySongs = db.getSongs("Country");
        assertNotNull(countrySongs);
        assertEquals(1, countrySongs.size());
        assertTrue(countrySongs.contains("Sweet Alabama"));

        Set<String> noSongs = db.getSongs("Pop");
        assertNotNull(noSongs);
        assertTrue(noSongs.isEmpty());
    }

    @Test
    public void testAdditionOfDuplicateSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Savage"); // Try adding duplicate
        assertEquals(1, db.getSongs("Rap").size());
    }
}
