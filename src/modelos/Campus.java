package modelos;

import java.util.ArrayList;

public class Campus {
        
    public ArrayList<Area> listaAreas = new ArrayList<>();
    
	public Estudiante  m_Estudiante ;
	public Area m_Area;
 

	public Campus(Estudiante est,Area area){
            this.m_Estudiante=est;
            this.m_Area=area;
	}

}
