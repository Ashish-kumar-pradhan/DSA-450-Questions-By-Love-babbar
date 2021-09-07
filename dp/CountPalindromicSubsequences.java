package dp;

public class CountPalindromicSubsequences {
	
	static long countPS(String str)
    {
        // Your code here
        int n = str.length();
        long dp[][] = new long[n][n];
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = 1;
        }
        long mod = 1000000007;
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j + i < n ; j++){
                if(str.charAt(j) == str.charAt(i+j)){
                    dp[j][i+j] = ((dp[j+1][i+j] + dp[j][i+j-1])%mod + 1)%mod;
                }
                else {
                    dp[j][i+j] = ((dp[j+1][i+j] + dp[j][i+j-1])%mod - dp[j+1][i+j-1]%mod + mod)%mod;
                }
            }
        }
//        for(int i = 0 ; i < n ; i++){
//            for(int j = 0 ; j < n ; j++){
//            	System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//       }
        return dp[0][n-1];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(countPS("mbcgepnkdqemhmkuqosgeonbcrphobcmbhrgppkfpdqckigsomktpsurknsospighufulqijcupisnuqcqfpuckrndmqeeklqfcrfnemeghmnlunlpslncqllmbebnoudihgpigrfbrqbcurmqnfroheqltkbnpocousjepehgppmblodppsqrglprtekmsqlqekhjseotocgkfcrkssmmenhitupdcoujscnetbrrcdoctqdfssupfnuolrobckseuromqsuoctmnbudnthrctndtrnietrkqbropugptpuhclftohuendhhnpnhqqkmksigbcrtrtjtmhonnumnnupgtntdhefushmrshselrdfqnoddmqqhjrjtknmokrlgdrcomnbjdlcothrhgsljreflusnnnrkckstoluhduguicfomgjkorgmujoonekscbikeshbqfqfrbcmspqphujltqebostmbkunhhhqmdqdqmfsbekeonmsiqsbomhmrtnqtmutrbmrlthhieihqjebklckemustsufbqmbjcqdtkdjscmdsrkkqdfojplektrsinjfbhmfoumqirfehdhgdkejefupstmhqesqobcqftpgbrckqrjqdosfjschbhbuobhriguipdkeeggbtecsqheelrqiqfdokqhrdsdcifnkulloeckeghochpdfjpqesqmqsngcbpngjurdsbhtsilkoiglbgmofnjuojtgjqnpgobmfehjnqbfmternugrhbnrgqusloiuusqogtqsclesqsmhjghqdtqkgikghflotgfmkdngklcorqlegpdidptohlgnnnflhtcmpcehogooflhujpichtknfqicpkjmgjjdnmtsprcueeolruiqjpeldelnukfitfgqsdejupshdtebtqfrqbtuttkldbuupidurhimnrmpdfjtbuinfchjormhissgpdbisugtrqqdiqekpnicpej"));

	}

}
