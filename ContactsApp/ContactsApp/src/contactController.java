import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class contactController {
	@FXML private ListView<Contact> contactListView;

	private final ObservableList<Contact> contact = 
			FXCollections.observableArrayList();

	@FXML
	private TextField firstNameTextField;

	@FXML
	private TextField lastNameTextField;

	@FXML
	private TextField emailTextField;

	@FXML
	private TextField phoneNumberTextField;

	@FXML
	private ImageView imageView;

	public void initialize() {
		contact.add(new Contact("Ryan L", "Ryan", "Anderson", "Ryanl@gmail.com", "(920)555-1234", "/contact1.jpeg"));
		contact.add(new Contact("Jake S", "Jake", "Peter", "Jakes@gmail.com", "(920)555-1235", "/contact2.jpeg"));
		contact.add(new Contact("Chuck P", "Chuck", "Shaun", "Chuckp@gmail.com", "(920)555-1236", "/contact3.png"));
		contactListView.setItems(contact); 

		contactListView.getSelectionModel().selectedItemProperty().
		addListener(
				new ChangeListener<Contact>() {                                   
					@Override                                                     
					public void changed(ObservableValue<? extends Contact> ov,
							Contact oldValue, Contact newValue) { 
						firstNameTextField.setText(newValue.getFirstName());
						lastNameTextField.setText(newValue.getLastName());
						emailTextField.setText(newValue.getEmail());
						phoneNumberTextField.setText(newValue.getPhoneNumber());
						imageView.setImage(new Image(newValue.image()));
					}
				}
				);    
		
	}     
}
