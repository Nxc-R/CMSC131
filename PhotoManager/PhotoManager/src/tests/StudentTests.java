package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import photomanager.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StudentTests {
	/*
	 * Each method in a JUnit StudentTest class represents a test. You can write
	 * code in a method of this class as you do in the main method of a driver. 
	 * As you write your code, define methods in this class that test each of 
	 * the methods you need to implement. When you run a method you can have 
	 * System.out.println statements to see the results of your code. Using 
	 * this approach is simpler than defining driver classes.
	 * 
	 * For this project you don't need to worry about adding assertions. If you 
	 * don't add assertions, by default, every test will pass (so when you run 
	 * your student tests you will see a green bar).  We have left two examples of 
	 * tests below so you can see how you can test your code.
	 * 
	 * You can run a single test by double-clicking on the method's name and 
	 * selecting Run-->Run As-->JUnit Test.  You can also double-click on the 
	 * method's name and select the white triangle that is inside of a green circle 
	 * (under Refactor).
	 * 
	 * Remember that each method representing a test must have @Test (this is called
	 * an annotation).
	 */
	
	/* Remove the following test and add your tests.  We added this test to show the
	 * @Test annotion. 
	 */
	
	@Test
	public void testingPhototoString() {
		Photo photo = new Photo("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		System.out.println(photo);
		System.out.println("===========================");
	}
	@Test
	public void testingPhotogetPhotoSource() {
		Photo photo = new Photo("umcp/college8.jpg", 200, 200, "10/18/2020-18:30");
		System.out.println("Photo source: " + photo.getPhotoSource());
		System.out.println("===========================");
	}
	@Test
	public void testingPhotogetWidth() {
		Photo photo = new Photo("umcp/college8.jpg", 400, 300, "10/18/2020-18:30");
		System.out.println("Photo width: " + photo.getWidth());
		System.out.println("===========================");
	}
	@Test
	public void testinggetHeight() {
		Photo photo = new Photo("umcp/college7.jpg", 400, 600, "10/18/2020-19:10");
		System.out.println("Photo height: " + photo.getHeight());
		System.out.println("===========================");
	}
	@Test
	public void testingPhotogetDate() {
		Photo photo = new Photo("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		System.out.println("Photo date: " + photo.getDate());
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoaddComments() {
		Photo photo = new Photo("umcp/college2.jpg", 300, 400, "10/18/2020-17:10");
		photo.addComments("Building");
		System.out.println("Comments: " + photo.getComments());
		System.out.println("===========================");
	}
	@Test
	public void testingPhotogetComments() {
		Photo photo = new Photo("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		photo.addComments("Stadium");
		System.out.println(photo.getComments());
		photo.addComments("Building");
		System.out.println(photo.getComments());
		System.out.println("===========================");
	}
	@Test
	public void testingPhotocopyCons() {
		Photo photo = new Photo("umcp/college2.jpg", 300, 400, "10/18/2020-17:10");
		photo.addComments("On Campus");
		Photo copyPhoto = new Photo(photo);
		copyPhoto.addComments("Driving by");
		System.out.println(copyPhoto + " is a copy of " + photo);
		System.out.println("Comments for original photo: " + photo.getComments());
		System.out.println("Comments for copied photo: " + copyPhoto.getComments());
		
		System.out.println("===========================");
	}
	@Test
	public void testingPhotocompareTo() {
		Photo photo1 = new Photo("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		Photo photo2 = new Photo("umcp/college2.jpg", 300, 400, "10/18/2020-17:10");
		Photo photo3 = new Photo("umcp/college9.jpg", 200, 200, "09/23/2020-09:10");
		Photo photo4 = new Photo("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		System.out.println("photo1 occured on the same date as photo2?: " + (photo1.compareTo(photo2) == 0));
		System.out.println("photo3 occured before photo2: " + (photo3.compareTo(photo2) < 0));
		System.out.println("photo4 occured after photo1: " + (photo4.compareTo(photo1) > 0));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagertoString() {
		PhotoManager photoManager = new PhotoManager();
		photoManager.addPhoto("umcp/college2.jpg", 300, 400, "10/18/2020-17:10");
		System.out.println(photoManager);
	}
	@Test
	public void testingPhotoManageraddPhoto() {
		PhotoManager photoManager = new PhotoManager();
		photoManager.addPhoto("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		System.out.println(photoManager);
		
		photoManager.addPhoto("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		System.out.println(photoManager);
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagerfindPhoto() {
		PhotoManager photoManager = new PhotoManager();
		photoManager.addPhoto("umcp/college8.jpg", 200, 280, "10/18/2020-18:10");
		photoManager.addPhoto("umcp/college3.jpg", 290, 200, "11/18/2019-09:00");
		photoManager.addPhoto("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		System.out.println("The index of the target photo is: " + photoManager.findPhoto("umcp/college3.jpg"));
		System.out.println("Second target photo exist in the ArrayList?: " + (photoManager.findPhoto("umcp/college4.jpg") >= 0));
		System.out.println("Third target photo exist in the ArrayList?: " + (photoManager.findPhoto("umcp/college7.jpg") >= 0));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManageraddComment() {
		PhotoManager photoManager = new PhotoManager();
		String photoToComment = "umcp/college6.jpg";
		String photoToComment2 = "umcp/college2.jpg";
		photoManager.addPhoto("umcp/college2.jpg", 300, 400, "10/18/2020-17:10");
		photoManager.addPhoto("umcp/college6.jpg", 250, 250, "10/18/2020-19:10");
		photoManager.addComment(photoToComment, "New Phone Who dis");
		System.out.println("Comments for " + photoToComment + " " + photoManager.getComments(photoToComment));
		photoManager.addComment(photoToComment2, "");
		System.out.println("Comments for " + photoToComment2 + " " + photoManager.getComments(photoToComment2));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagergetComments() {
		PhotoManager photoManager = new PhotoManager();
		String photoToComment = "umcp/college9.jpg";
		photoManager.addPhoto("umcp/college8.jpg", 220, 280, "10/18/2020-18:10");
		photoManager.addPhoto("umcp/college10.jpg", 200, 480, "11/18/2010-18:10");
		photoManager.addPhoto("umcp/college9.jpg", 300, 280, "10/18/2020-18:10");
		photoManager.addComment(photoToComment, "Campus kidz");
		System.out.println("Comments for " + photoToComment + " " + photoManager.getComments(photoToComment));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagerremoveAllPhotos() {
		PhotoManager photoManager = new PhotoManager();
		photoManager.addPhoto("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		photoManager.addPhoto("umcp/college6.jpg", 250, 250, "10/18/2020-19:10");
		System.out.println("Photos before clearing:" + "\n" + photoManager);
		photoManager.removeAllPhotos();
		System.out.println("Photos after clearing:" + "\n" + photoManager);
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagerremovePhoto() {
		PhotoManager photoManager = new PhotoManager();
		String photoToRemove = "umcp/college10.jpg";
		String photoToRemove2 = "umcp/college11.jpg";
		photoManager.addPhoto("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		photoManager.addPhoto("umcp/college6.jpg", 250, 250, "10/18/2020-19:10");
		photoManager.addPhoto("umcp/college10.jpg", 200, 480, "09/18/2018-18:10");
		photoManager.addPhoto("umcp/college15.jpg", 400, 480, "12/18/2018-18:10");
		System.out.println("Photos before removing first target photo:" + "\n" + photoManager);
		photoManager.removePhoto(photoToRemove);
		System.out.println("Photos after removing first target photo:" + "\n" + photoManager);
		System.out.println("Second target photo exists and is removed?: " + (photoManager.removePhoto(photoToRemove2)));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagerloadPhotos() {
		String filename = "photosToLoad.txt";
		PhotoManager photoManager = new PhotoManager();
		photoManager.loadPhotos(filename);
		System.out.println("Loaded photos" + photoManager);
		System.out.println("Were the photos loaded properly?: " + (photoManager.loadPhotos(filename)));
		System.out.println("===========================");
	}
	@Test
	public void testingPhotoManagersortPhotosByDate() {
		PhotoManager photoManager = new PhotoManager();
		photoManager.addPhoto("umcp/college7.jpg", 200, 200, "10/18/2020-19:10");
		photoManager.addPhoto("umcp/college13.jpg", 200, 480, "09/18/2018-18:10");
		photoManager.addPhoto("umcp/college15.jpg", 300, 700, "12/18/2018-18:10");
		photoManager.addPhoto("umcp/college11.jpg", 500, 480, "08/18/2010-18:10");
		photoManager.addPhoto("umcp/college06.jpg", 600, 480, "12/18/2019-18:10");
		photoManager.addPhoto("umcp/college12.jpg", 700, 480, "05/18/2004-18:10");
		System.out.println("Photos before Sorting:" + "\n" + photoManager);
		photoManager.sortPhotosByDate();
		System.out.println("Photos after Sorting:" + "\n" + photoManager);
	}
}