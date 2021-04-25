package ll;

import java.util.ArrayList;



public class CreateGrammar {
	Vn EV;
	Vn S;
    public ArrayList<V> create() {
    	 Vt a=new Vt("a");
    	 Vt b=new Vt("b");
    	 Vt c=new Vt("c");
    	 Vt d=new Vt("d");
    	 Vt kongVt=new Vt("empty");
    	  ArrayList<V> ea1=new ArrayList<V>();
    	 ea1.add(d);
    	  ArrayList<V> ea2=new ArrayList<V>();
    	 ea2.add(kongVt);
    	 ArrayList<ArrayList<V>> ea=new ArrayList<ArrayList<V>>();
    	 ea.add(ea1);
    	 ea.add(ea2);
    	 Vn A=new Vn("A", ea);
    	 A.setEmpty(true);
    	  ArrayList<V> eb1=new ArrayList<V>(); 
    	  eb1.add(c);
    	  eb1.add(b);
    	  eb1.add(a);
    	  
    	  ArrayList<V> eb2=new ArrayList<V>(); 
    	  eb2.add(b);
    	  
    	  ArrayList<V> eb3=new ArrayList<V>(); 
    	  eb3.add(A);
    	  eb3.add(A);
    	 // eb3.add(a);
    	  ArrayList<ArrayList<V>> eb=new ArrayList<ArrayList<V>>();
    	  eb.add(eb1);
    	  eb.add(eb2);
    	  eb.add(eb3);
    	  Vn B=new Vn("B", eb);	
    	   B.setEmpty(true);
    	  ArrayList<V> es1=new ArrayList<V>(); 
    	  es1.add(B);
    	  es1.add(a);
    	  
    	  ArrayList<ArrayList<V>> es=new ArrayList<ArrayList<V>>();
    	  es.add(es1);
          S=new Vn("S", es);
          ArrayList<V> vList=new ArrayList<V>();
          vList.add(S);
          vList.add(B);
          vList.add(A);
          return vList;
    }
    
    public ArrayList<V> create2() {
    	Vt i=new Vt("i");
    	Vt zV=new Vt("(");
    	Vt zV2=new Vt(")");
    	Vt cV=new Vt("*");
    	Vt jV=new Vt("+");
    	Vt k=new Vt("empty");
    	Vn fV=new Vn("F");
    	ArrayList<V> f1=new ArrayList<V>();
    	f1.add(i);
    	ArrayList<V> f2=new ArrayList<V>();
    	f2.add(zV);
    	
    	
    	Vn tV=new Vn("TT");
    	ArrayList<V> tt1=new ArrayList<V>();
    	tt1.add(cV);
    	tt1.add(fV);
    	tt1.add(tV);
    	ArrayList<V> tt2=new ArrayList<V>();
        tt2.add(k); 
        ArrayList<ArrayList<V>> tts=new ArrayList<ArrayList<V>>();
        tts.add(tt1);
        tts.add(tt2);
        tV.setVlist(tts);
        
        Vn T=new Vn("T");
        ArrayList<V> t1=new ArrayList<V>();
        t1.add(fV);
        t1.add(tV);
        ArrayList<ArrayList<V>> ts=new ArrayList<ArrayList<V>>();
        ts.add(t1);
        T.setVlist(ts);
        
        Vn eVn=new Vn("EE");
        ArrayList<V> ee1=new ArrayList<V>();
        ee1.add(jV);
        ee1.add(T);
        ee1.add(eVn);
        ArrayList<V> ee2=new ArrayList<V>();
        ee2.add(k);
        ArrayList<ArrayList<V>> ees=new ArrayList<ArrayList<V>>();
        ees.add(ee1);
        ees.add(ee2);
        eVn.setVlist(ees);
        
        EV=new Vn("E");
        ArrayList<V> e1=new ArrayList<V>();
        e1.add(T);
        e1.add(eVn);
        ArrayList<ArrayList<V>> es=new ArrayList<ArrayList<V>>();
        es.add(e1);
        EV.setVlist(es);
        f2.add(EV);
    	f2.add(zV2);
    	ArrayList<ArrayList<V>> fs=new ArrayList<ArrayList<V>>();
    	fs.add(f1);
    	fs.add(f2);
    	fV.setVlist(fs);
        
        eVn.setEmpty(true);
        tV.setEmpty(true);
        ArrayList<V> vList=new ArrayList<V>();
        vList.add(EV);
        vList.add(eVn);
        vList.add(T);
        vList.add(tV);
        vList.add(fV);
        return vList;
    }
    
}
