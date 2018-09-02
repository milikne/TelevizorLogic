package classes;

import enums.Enumeracija;
import interfaces.IOperations;

/*
 * Televizor klasa, omogucava on i off televizora i promenu kanala i volume
 * implements IOperations interface
 * Razvoj softvera otvorenog koda - kolokvijum
 * @author Milica Knezevic
 * @version v1.0
 */

public class Televizor implements IOperations {

	protected int kanal;
	protected int volume;
	
	protected Enumeracija stanje;
	
	/**
	 * konstruktor klase Televizor
	 */
	public Televizor(){
		this.kanal = 0;
		this.volume = 0;
		this.stanje = Enumeracija.sOFF;
	}
	
	/*
	 * @return kanal
	 */

	public int getKanal() {
		return kanal;
	}

	/*
	 * @return set kanal
 	*/
	public void setKanal(int kanal) {
		this.kanal = kanal;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public Enumeracija getStanje() {
		return stanje;
	}


	public void setStanje(Enumeracija stanje) {
		this.stanje = stanje;
	}


	/*
	 *@param kanal  inkrementuje kanal
	 */
	@Override
	public void kanalUp() {
		
		if(this.kanal<16){
			setKanal(this.kanal+1);
			
		}
	}

	/*
	 *@param kanal  dekrementuje kanal
	 */
	@Override
	public void kanalDown() {
		
		if(this.kanal>1){
			setKanal(this.kanal-1);
		}
		
	}
	
	/*
	 *@param volume inkrementuje volume
	 */
	

	@Override
	public void volumeUp() {
		if(this.volume < 20){
			setVolume(this.volume + 1);
		}
		
	}
	
	/*
	 *@param volume  dekrementuje volume
	 */


	@Override
	public void volumeDown() {
		if(this.volume > 0){
			setVolume(this.volume -1);
		}
		
	}
	
	/*
	 * @param stanje set to off
	 */
  public void StanjeOff(){
		setStanje(Enumeracija.sOFF);
		setKanal(0);
		setVolume(0);
	}
  
  /*
   * @param stanje set to on
   */
  public void StanjeOn(){
	  setStanje(Enumeracija.sON);
	  setKanal(1);
	  setVolume(10);
  }
}
