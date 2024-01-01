package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase
 * letters, the email may contain one or more '.' or '+'. For example, in "alice@leetcode.com", "alice" is 
 * the local name, and "leetcode.com" is the domain name. If you add periods '.' between some characters in 
 * the local name part of an email address, mail sent there will be forwarded to the same address without 
 * dots in the local name. Note that this rule does not apply to domain names.
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 */
public class UniqueEmailAddress {
	
	public static void main(String args[]) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
			"testemail+david@lee.tcode.com","test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
		System.out.println(numUniqueEmails(emails));
	}
	
	public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueIds = new HashSet<>();
        String[] nameAndDomain = new String[2];
        for(String email : emails){
            nameAndDomain = email.split("@");
            email = nameAndDomain[0].replaceAll("\\.", "").split("\\+")[0]+'@'+nameAndDomain[1];
            if(uniqueIds.contains(email))
                continue;
            uniqueIds.add(email);
        }
        return uniqueIds.size();
    }

}
