
public class Spielfeldplatz{

    public Spielfeldplatz ol;
    public Spielfeldplatz o;
    public Spielfeldplatz or;
    public Spielfeldplatz r;
    public Spielfeldplatz ur;
    public Spielfeldplatz u;
    public Spielfeldplatz ul;
    public Spielfeldplatz l;
    public Stein stein;

    public Spielfeldplatz(){
        this.ol=null;
        this.o=null;
        this.or=null;
        this.r=null;
        this.ur=null;
        this.u=null;
        this.ul=null;
        this.l=null;
        this.stein=null;
    }

    public int pruefeSenkrecht(int zaehler){
        return pruefeU(pruefeO(zaehler));
    }

    public int pruefeWaagerecht(int zaehler){
        return pruefeR(pruefeL(zaehler));
    }

    public int pruefeFallend(int zaehler){
        return pruefeUR(pruefeOL(zaehler));
    }

    public int pruefeSteigend(int zaehler){
        return pruefeOR(pruefeUL(zaehler));
    }

    public int pruefeOL(int zaehler){
        if(ol!=null){
            if(stein.gebeHost()==ol.gebeStein().gebeHost()){
                zaehler+=1;
                ol.pruefeOL(zaehler);
            }	
        }
        return zaehler;
    }

    public int pruefeO(int zaehler){
        if(o!=null){
            if(stein.gebeHost()==o.gebeStein().gebeHost()){
                zaehler+=1;
                o.pruefeO(zaehler);
            }
        }
        return zaehler;		
    }

    public int pruefeOR(int zaehler){
		if(or!=null){
			if(stein.gebeHost()==or.gebeStein().gebeHost()){
				zaehler+=1;
				or.pruefeOR(zaehler);
			}
		}
		return zaehler;		
	}
	
	public int pruefeR(int zaehler){
		if(r!=null){
			if(stein.gebeHost()==r.gebeStein().gebeHost()){
				zaehler+=1;
				r.pruefeR(zaehler);
			}
		}
		return zaehler;		
	}
	
	public int pruefeUR(int zaehler){
		if(ur!=null){
			if(stein.gebeHost()==ur.gebeStein().gebeHost()){
				zaehler+=1;
				ur.pruefeUR(zaehler);
			}
		}
		return zaehler;		
	}
	
	public int pruefeU(int zaehler){
		if(u!=null){
			if(stein.gebeHost()==u.gebeStein().gebeHost()){
				zaehler+=1;
				u.pruefeU(zaehler);
			}
		}
		return zaehler;		
	}
	
	
	public int pruefeUL(int zaehler){
		if(ul!=null){
			if(stein.gebeHost()==ul.gebeStein().gebeHost()){
				zaehler+=1;
				ul.pruefeUL(zaehler);
			}
		}
		return zaehler;		
	}
	
	public int pruefeL(int zaehler){
		if(l!=null){
			if(stein.gebeHost()==l.gebeStein().gebeHost()){
				zaehler+=1;
				l.pruefeL(zaehler);
			}
		}
		return zaehler;		
	}
	
	public boolean pruefeSieg(){
		if(pruefeSenkrecht(1)>=4 || pruefeWaagerecht(1)>=4 || pruefeFallend(1)>=4 || pruefeSteigend(1)>=4){
			return true;
		}
		return false;
	}
	
	public Stein gebeStein(){
		return stein;
	}

	public void einfuegen(Stein stein){
		this.stein = stein;
	}
}

