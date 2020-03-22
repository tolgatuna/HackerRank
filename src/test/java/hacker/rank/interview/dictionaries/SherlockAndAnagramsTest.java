package hacker.rank.interview.dictionaries;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SherlockAndAnagramsTest {


    @Test
    public void shouldReturnZeroIfThereIsNoAnyRepeatedAnagram() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("abcd"), Matchers.is(0));
    }

    @Test
    public void shouldReturnFourForString_abba() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("abba"), Matchers.is(4));
    }

    @Test
    public void shouldReturnFiveForString_cdcd() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("cdcd"), Matchers.is(5));
    }

    @Test
    public void shouldReturnThreeForString_ifailuhkqq() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"), Matchers.is(3));
    }

    @Test
    public void shouldReturnTenForString_kkkk() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("kkkk"), Matchers.is(10));
    }

    @Test
    public void testMethodForLongStrings() {
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel"), Matchers.is(399));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("gffryqktmwocejbxfidpjfgrrkpowoxwggxaknmltjcpazgtnakcfcogzatyskqjyorcftwxjrtgayvllutrjxpbzggjxbmxpnde"), Matchers.is(471));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("dbcfibibcheigfccacfegicigcefieeeeegcghggdheichgafhdigffgifidfbeaccadabecbdcgieaffbigffcecahafcafhcdg"), Matchers.is(1464));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("dfcaabeaeeabfffcdbbfaffadcacdeeabcadabfdefcfcbbacadaeafcfceeedacbafdebbffcecdbfebdbfdbdecbfbadddbcec"), Matchers.is(2452));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("gjjkaaakklheghidclhaaeggllagkmblhdlmihmgkjhkkfcjaekckaafgabfclmgahmdebjekaedhaiikdjmfbmfbdlcafamjbfe"), Matchers.is(873));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("fdbdidhaiqbggqkhdmqhmemgljaphocpaacdohnokfqmlpmiioedpnjhphmjjnjlpihmpodgkmookedkehfaceklbljcjglncfal"), Matchers.is(585));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("bcgdehhbcefeeadchgaheddegbiihehcbbdffiiiifgibhfbchffcaiabbbcceabehhiffggghbafabbaaebgediafabafdicdhg"), Matchers.is(1305));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), Matchers.is(166650));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("mhmgmbbccbbaffhbncgndbffkjbhmkfncmihhdhcebmchnfacdigflhhbekhfejblegakjjiejeenibemfmkfjbkkmlichlkbnhc"), Matchers.is(840));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("fdacbaeacbdbaaacafdfbbdcefadgfcagdfcgbgeafbfbggdedfbdefdbgbefcgdababafgffedbefdecbaabdaafggceffbacgb"), Matchers.is(2134));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("bahdcafcdadbdgagdddcidaaicggcfdbfeeeghiibbdhabdhffddhffcdccfdddhgiceciffhgdibfdacbidgagdadhdceibbbcc"), Matchers.is(1571));
        assertThat(SherlockAndAnagrams.sherlockAndAnagrams("dichcagakdajjhhdhegiifiiggjebejejciaabbifkcbdeigajhgfcfdgekfajbcdifikafkgjjjfefkdbeicgiccgkjheeiefje"), Matchers.is(1042));
    }
}