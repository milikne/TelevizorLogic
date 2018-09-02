package interfaces;

public interface IOperations {
	/*
	 * kanalUp metoda
	 * inkrementuje vrednost kanala za 1
	 * @return inkrementovanu vrednost kanala
	 */
	public void kanalUp();
	
	/*
	 * kanalDown metoda
	 * dekremetuje vrednost kanala za 1
	 * @return dekrementovanu vrednost kanala
	 */
	public void kanalDown();
	
	/*
	 * volumeUp metoda
	 * inkrementuje vrednost volume za 1
	 * @return inkrementovana vrednost volume
	 */
	public void volumeUp();
	
	/*
	 * volumeDown metoda
	 * dekrementuje vrednost volume za 1
	 * @return dekrementovana vrednost volume
	 */
	public void volumeDown();

}
