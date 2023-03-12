/*
 * 
 * You can use the following import statements
 * import org.springframework.jdbc.core.RowMapper;
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * 
 */

// Write your code here

package com.example.song.model;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song>{
    public Song mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Song(
            rs.getInt("songId"),
            rs.getString("songName"),
            rs.getString("lyricist"),
            rs.getString("singer"),
            rs.getString("musicDirector")
        );
    }
}