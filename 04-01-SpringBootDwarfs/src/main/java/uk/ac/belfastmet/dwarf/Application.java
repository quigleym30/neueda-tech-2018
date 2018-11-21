package uk.ac.belfastmet.dwarf;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		Dwarf sleepy = new Dwarf("Sleepy","Disney","Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy","Disney","Happy.png");
		dwarfs.add(happy);
		Dwarf doepy = new Dwarf("Doepy","Disney","Doepy.png");
		dwarfs.add(doepy);
		Dwarf basful = new Dwarf("Basful","Disney","Basful.png");
		dwarfs.add(basful);
		Dwarf sneezy = new Dwarf("Sneezy","Disney","Sneezy.png");
		dwarfs.add(sneezy);
		Dwarf doc = new Dwarf("Doc","Disney","Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy","Disney","Grumpy.png");
		dwarfs.add(grumpy);
		Dwarf thorin=new Dwarf("Thorin","Tolkien","thorin.png");
		dwarfs.add(thorin);
		Dwarf balin=new Dwarf("Balin","Tolkien","balin.png");
		dwarfs.add(balin);
		Dwarf dwalin=new Dwarf("Dwalin","Tolkien","dwalin.png");
		dwarfs.add(dwalin);
		Dwarf fili=new Dwarf("Fili","Tolkien","fili.png");
		dwarfs.add(fili);
		Dwarf kili=new Dwarf("Kili","Tolkien","kili.png");
		dwarfs.add(kili);
		Dwarf dori=new Dwarf("Dori","Tolkien","dori.png");
		dwarfs.add(dori);
		Dwarf nori=new Dwarf("Nori","Tolkien","nori.png");
		dwarfs.add(nori);
		Dwarf ori=new Dwarf("Ori","Tolkien","ori.png");
		dwarfs.add(ori);
		Dwarf oin=new Dwarf("Oin","Tolkien","oin.png");
		dwarfs.add(oin);
		Dwarf gloin=new Dwarf("Gloin","Tolkien","gloin.png");
		dwarfs.add(gloin);
		Dwarf bifur=new Dwarf("Bifur","Tolkien","bifur.png");
		dwarfs.add(bifur);
		Dwarf bofur=new Dwarf("Bofur","Tolkien","bofur.png");
		dwarfs.add(bofur);
		Dwarf bombur=new Dwarf("Bombur","Tolkien","bombur.png");
		dwarfs.add(bombur);
	}
}
