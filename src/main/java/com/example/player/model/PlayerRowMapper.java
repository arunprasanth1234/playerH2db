/*
 * You can use the following import statements
 * 
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 * 
 */

// Write your code here 
package com.example.player.model;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player> {
    @Override
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Player(
                rs.getInt("PLAYERID"),
                rs.getString("PLAYERNAME"),
                rs.getInt("JERSEYNUMBER"),
                rs.getString("ROLE"));
    }
}