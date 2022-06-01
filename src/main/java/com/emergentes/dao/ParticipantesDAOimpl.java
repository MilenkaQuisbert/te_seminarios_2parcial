
package com.emergentes.dao;

import com.emergentes.modelo.Participantes;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ParticipantesDAOimpl extends ConexionDB implements ParticipantesDAO {

    @Override
    public void insert(Participantes participantes) throws Exception {
        String sql = "insert into participantes (apellidos,nombres,id_seminario,confirmado) values (?,?,?,?)";
        this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, participantes.getApellidos());
        ps.setString(2, participantes.getNombres());
        ps.setInt(3, participantes.getId_seminario());
        ps.setInt(4, participantes.getConfirmado());

        ps.executeUpdate();
        this.desconectar();
    }

    @Override
    public void update(Participantes participantes) throws Exception {
            String sql = "update participantes set apellidos=?,nombres=?,id_seminario=?,confirmado=? where id=?";
        this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, participantes.getApellidos());
        ps.setString(2, participantes.getNombres());
        ps.setInt(3, participantes.getId_seminario());
        ps.setInt(4, participantes.getConfirmado());
        ps.setInt(5, participantes.getId());
        ps.executeUpdate();
        this.desconectar();
    }

    @Override
    public void delete(int id) throws Exception {
        String sql = "delete from participantes where id = ?";
        this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        
    }

    @Override
    public Participantes getById(int id) throws Exception {
          Participantes par = new Participantes();
        String sql = "select * from participantes where id = ?";
        this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            par.setId(rs.getInt("id"));
            par.setApellidos(rs.getString("apellidos"));
            par.setNombres(rs.getString("nombres"));
            par.setId_seminario(rs.getInt("id_seminario"));
            par.setConfirmado(rs.getInt("confirmado"));

        }
        this.desconectar();
        return par;
    }

    @Override
    public List<Participantes> getAll() throws Exception {
        
         List<Participantes> lista = null;
        String sql = "select * from participantes";
        this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        lista = new ArrayList<Participantes>();
        while (rs.next()) {            
            Participantes par = new Participantes();
          par.setId(rs.getInt("id"));
            par.setApellidos(rs.getString("apellidos"));
            par.setNombres(rs.getString("nombres"));
            par.setId_seminario(rs.getInt("id_seminario"));
            par.setConfirmado(rs.getInt("confirmado"));
            lista.add(par);
        }
        this.desconectar();
        return lista;
    }
    
}
