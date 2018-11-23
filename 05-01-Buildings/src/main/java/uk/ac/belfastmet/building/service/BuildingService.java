package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.FloorArea;
import uk.ac.belfastmet.building.domain.Footprint;
import uk.ac.belfastmet.building.domain.Volume;

public class BuildingService {

	public ArrayList<Volume> getVolume(){
		
		Volume bef = new Volume("Boeing Everett Factory","US","Everett, Washington","BEF.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.5097818615614!2d-122.27426088431487!3d47.92652207920712!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e0!3m2!1sen!2suk!4v1542974759990\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","398,000 m2","13.3 million m3","Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747. ");
		Volume gmm = new Volume("Great Mosque of Mecca"," Saudi Arabia","Hijaz-Saudi Arabia","GMM.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1857.0800113042224!2d39.82588098923248!3d21.422954278425646!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542974863702\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","356,000 m2","8 million m3","The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.");
		Volume jlp = new Volume("Jean-Luc Lagardère Plant","France","Toulouse-Blagnac","JLP.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6409.284153722072!2d1.34578321379916!3d43.61638412541844!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12aeb013dcc93d19%3A0xbd779845c9cf3740!2sAirbus+-+Louis+Br%C3%A9guet+Site!5e1!3m2!1sen!2suk!4v1542975516928\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","122,500 m2","5.6 million m3","The assembly hall of the Airbus A380, the world's largest airliner.");
		Volume cwc = new Volume("Boeing Composite Wing Center","US","Everett, Washington","CWC.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6183.905874287547!2d-122.27259085163017!3d47.92726525341383!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e1!3m2!1sen!2suk!4v1542975920710\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","111,500 m2","3.7 million m3","Boeing's assembly site for the production of composite wings for the 777-8 and 777-9");
		Volume aer = new Volume("Aerium","Germany","Halbe, Brandenburg","AER.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3638.3917095467755!2d13.745438687115545!3d52.03892378641938!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a804edb23f5915%3A0x20148692752fbd91!2sTropical+Islands!5e1!3m2!1sen!2suk!4v1542976379053\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","70,000 m2","5.2 million m3","A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.");
		
		ArrayList<Volume> volumes = new ArrayList<Volume>() ;
			volumes.add(bef);
			volumes.add(gmm);
			volumes.add(jlp);
			volumes.add(cwc);
			volumes.add(aer);
			
			return volumes;
	}
	
	public ArrayList<Footprint> getFootprint(){
		
		Footprint afa = new Footprint("Aalsmeer Flower Auction Building","Netherlands","Aalsmeer","AFA.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12573.832697751337!2d4.775668332407508!3d52.25784383414217!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e1!3m2!1sen!2suk!4v1542977221258\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","518,000 m2","740 m x 700 m","The auction building of the flower auction in Aalsmeer.");
		Footprint tdm = new Footprint("The Dubai Mall","UAE","Dubai","TDM.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3685.3150920942185!2d55.27737741506192!3d25.19969188389505!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f4282ee133067%3A0x5d2deb27bf5ffc9!2sThe+Dubai+Mall!5e1!3m2!1sen!2suk!4v1542978792220\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","500,000 m2","N/A","N/A");
		Footprint tf = new Footprint("Tesla Fsctory","US","Fremont,California","TF.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3231.604233078885!2d-121.94680428464456!3d37.49250897981186!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fc654f67bbf49%3A0x2d4f6c443c47fb25!2sTesla+Factory+Store!5e1!3m2!1sen!2suk!4v1542979546576\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","427,354m2","N/A","Automobile production facility of Tesla Motors.");
		Footprint bef = new Footprint("Boeing Everett Factory","US","Everett, Washington","BEF.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.5097818615614!2d-122.27426088431487!3d47.92652207920712!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e0!3m2!1sen!2suk!4v1542974759990\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","398,000 m2","900 m x 495 m","Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747. ");
		Footprint dtt = new Footprint("Daikin Texas Technology Park","US","Waller, Texas","DTT.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3525.543254523222!2d-95.86331228483473!3d30.048518081880943!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8646d2de861ed379%3A0xb685128a4a3f270b!2sDaikin+Texas+Technology+Park!5e1!3m2!1sen!2suk!4v1542979969393\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","393,000 m2","N/A","Factory and distribution center for heating and air conditioning products");
		
		ArrayList<Footprint> footprints = new ArrayList<Footprint>() ;
		footprints.add(afa);
		footprints.add(tdm);
		footprints.add(tf);
		footprints.add(bef);
		footprints.add(dtt);
		
		return footprints;
	}
	
	public ArrayList<FloorArea> getFloorArea(){
		FloorArea cgc = new FloorArea("New Century Global Center","China","Chengdu","CGC.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3514.2308168359154!2d104.06334819956845!3d30.566408204019474!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x36efc665f7408dad%3A0x6805f3fc5714b82!2sGlobal+Center!5e1!3m2!1sen!2suk!4v1542980672043\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,760,000 m2");
		FloorArea dia = new FloorArea("Dubai International Airport Terminal 3","UAE","Dubai","DAI.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d35049.711265761645!2d55.336781445604046!3d25.25573820839974!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f5d0693260e69%3A0xe695d4007a48eee9!2sDubai+International+Airport!5e1!3m2!1sen!2suk!4v1542980895017\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,713,000 m2");
		FloorArea aab = new FloorArea("Abraj Al-Bait Endowment","Saudi Arabia","Mecca","AAB.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7583.292509791173!2d39.82136427508331!3d21.418793943153293!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204c82533f16f%3A0xca0cff6480eeca59!2sAbraj+Al+Bait+Mall+(Kingdom+Clock+Tower)!5e1!3m2!1sen!2suk!4v1542981623607\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,575,815 m2");
		FloorArea cw = new FloorArea("CentralWorld","Thailand","Bangkok","CW.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3956.2748999454125!2d100.53717281488659!3d13.746596590350869!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x30e29ecfc2f455e1%3A0xc4ad0280d8906604!2sCentralWorld!5e1!3m2!1sen!2suk!4v1542981916212\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,024,000m2");
		FloorArea afa = new FloorArea("Aalsmeer Flower Auction","Netherlands","Aalsmeer","AFA.png","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2493.0580437589933!2d4.780398215833141!3d52.258287579765444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e1!3m2!1sen!2suk!4v1542982086579\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","990,000 m2");
		
		ArrayList<FloorArea> floorArea=new ArrayList<FloorArea>();
		
		floorArea.add(cgc);
		floorArea.add(dia);
		floorArea.add(aab);
		floorArea.add(cw);
		floorArea.add(afa);
		
		return floorArea;
	}
}
