package ayakkabiproje0;

import static org.junit.Assert.*;
import org.junit.Test;


public class AdminAnasayfaTest {
	adminAnasayfa admin = new adminAnasayfa();
	
    @Test
    public void testStokEkle() {
    	String id ="100";
		
		admin.ayakkabiId.add(id);
		admin.stokList.add(11);
		admin.fiyatList.add(1265);
        int stokEkleReturn = admin.stokEkle(id, 5);
        assertEquals(16,stokEkleReturn);
        
    }
    
    @Test
    public void testStokAzalt() {
    	String id ="100";
		
		admin.ayakkabiId.add(id);
		admin.stokList.add(11);
		admin.fiyatList.add(1265);
		
        int stokAzaltReturn = admin.stokAzalt(id, 5);
        assertEquals(6,stokAzaltReturn);
    }
    
    
    
    @Test
    public void testFiyatGuncelle() {
    	String id ="100";
		
		admin.ayakkabiId.add(id);
		admin.stokList.add(3);
		admin.fiyatList.add(128);
		
		int fiyatGuncel =admin.fiyatGuncelle(id,130);
		assertEquals(130,fiyatGuncel);
    }
    
    @Test
    public void testStokSorgula() {
    	String id ="100";
		
		admin.ayakkabiId.add(id);
		admin.stokList.add(2);
		admin.fiyatList.add(1265);
		
		admin.stokSorgula(id);
		
        assertEquals(2,2);
    }

}