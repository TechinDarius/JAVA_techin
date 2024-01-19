package lt.techin.socNet;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class SocNetworkTests extends BaseSocialNetworkTest {
    @Override
    protected SocialNetwork getSocialNetwork() {
        return new MySocialNetwork();
    }
}
