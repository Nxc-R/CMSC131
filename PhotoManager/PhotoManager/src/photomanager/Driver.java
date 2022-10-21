package photomanager;

/**
 * @author cmsc131
 *
 */
public class Driver {

	public static void main(String[] args) {
		PhotoManager photoManager = new PhotoManager();
		String target = "umcp/college1.jpg", answer = "";
		
		/* Adding photos */
		photoManager.addPhoto("target", 300, 400, "09/17/2020-17:10");
		photoManager.addPhoto("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		photoManager.addPhoto(target, 200, 200, "10/18/2020-18:30");
		System.out.println(photoManager);
		//photoManager.removePhoto(target);
		System.out.println(photoManager.findPhoto(null));
		
		/* answer += "PhotoManager\n";
		answer += photoManager + "\n";
		photoManager.addComment(target, "School Visit");
		photoManager.addComment(target, "Cousins with me");
		answer += "Retrieving comments for " + target + "\n";
		answer += photoManager.getComments(target);
		System.out.println(photoManager.getComments(target));
		photoManager.sortPhotosByDate();
		answer += "\nAfter sorting photos by date\n" + photoManager + "\n";
		System.out.println(answer);
		photoManager.createHTMLPage("DriverWebPage1.html");
		System.out.println("Loading Photos");
		PhotoManager photoManager2 = new PhotoManager();
		photoManager2.loadPhotos("photoInfoToLoad.txt");
		photoManager2.createHTMLPage("DriverWebPage2.html"); 
		Photo photo = new Photo("test" , 4, 5, "01/01/1970-17:10");
		Photo photo2 = new Photo("test" , 4, 5, "01/0/1970-17:10");
		System.out.println(photo);
		photo.addComments("test");
		System.out.println(photo.getComments());
		photo.addComments("test2");
		System.out.println(photo.compareTo(photo2)); */
		
	}
}
