package seedu.address.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

import static seedu.address.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withNextOfKinName("Alice Dad").withNextOfKinPhone("94351111")
            .withFinancialPlans("Sample Financial Plan 1", "Sample Financial Plan 2")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withEmail("johnd@example.com")
            .withPhone("98765432").withNextOfKinName("Benson Dad").withNextOfKinPhone("98761111")
            .withFinancialPlans("Sample Financial Plan 1", "Sample Financial Plan 2")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withNextOfKinName("Carl Dad")
            .withNextOfKinPhone("95351111").withAddress("wall street").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withNextOfKinName("Daniel Dad")
            .withNextOfKinPhone("87651111").withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").withNextOfKinName("Elle Dad")
            .withNextOfKinPhone("94821113")
            .withFinancialPlans("Sample Financial Plan 2").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withNextOfKinName("Fiona Dad")
            .withNextOfKinPhone("94821111").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withFinancialPlans("Sample Financial Plan 1", "Sample Financial Plan 2")
            .withEmail("anna@example.com").withAddress("4th street").withNextOfKinName("George Dad")
            .withNextOfKinPhone("94821112").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withNextOfKinName("Hoon Dad")
            .withFinancialPlans("Sample Financial Plan 1", "Sample Financial Plan 2")
            .withNextOfKinPhone("84822222").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withNextOfKinName("Ida Dad")
            .withNextOfKinPhone("84822221").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withNextOfKinName(VALID_NEXT_OF_KIN_NAME_AMY)
            .withNextOfKinPhone(VALID_NEXT_OF_KIN_PHONE_AMY).withFinancialPlans(VALID_FINANCIAL_PLAN_1).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withNextOfKinName(VALID_NEXT_OF_KIN_NAME_BOB)
            .withNextOfKinPhone(VALID_NEXT_OF_KIN_PHONE_BOB).withFinancialPlans(VALID_FINANCIAL_PLAN_1, VALID_FINANCIAL_PLAN_2)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
