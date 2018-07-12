public class Main {

    public static void main (String [] args) {

        Email em1 = new Email("William", "Powell");

        System.out.println("Name set as " + em1.getName());
        System.out.println("Email set as " + em1.getEmail());
        System.out.println("Mailbox capacity = "+ em1.getMailboxCapacity());
        System.out.println("PW = " + em1.getPassword());

        em1.changePassword("ABCD1234");
        em1.setMailboxCapacity(2000);

        System.out.println("New PW = " + em1.getPassword());
        System.out.println("Mailbox capacity = " + em1.getMailboxCapacity());

        em1.setAltEmail("asdf@abc.com");
        System.out.println("Alt email = " + em1.getAltEmailAddress());

    }
}
