import javax.swing.*;
import java.awt.*;

/**
 * @author Amudhan Manisekaran
 * @version 1.0
 */

public class Button {
    public void addButtonsToLeftPanel(LeftPanel panel){

        JButton openButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/openbracket.jpg"));
        openButton.setPreferredSize(new Dimension(200,100));
        openButton.setFont(new Font("Arial", Font.PLAIN, 30));
        openButton.addActionListener(e -> {
            openButton.setName("openButton");
            resetButtonClicked(openButton);
        });
        panel.add(openButton);

        JButton closeButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/closebracket.jpg"));
        closeButton.setPreferredSize(new Dimension(200,100));
        closeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        closeButton.addActionListener(e -> {
            closeButton.setName("closeButton");
//                closeButton.setText("close bracket clicked");
            resetButtonClicked(closeButton);
        });
        panel.add(closeButton);

        JButton lessThanButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/lessthan.jpg"));
        lessThanButton.setPreferredSize(new Dimension(200,100));
        lessThanButton.setFont(new Font("Arial", Font.PLAIN, 30));
        lessThanButton.addActionListener(e -> {
            lessThanButton.setName("lessThanButton");
//                lessThanButton.setText("lessThanButton");
            resetButtonClicked(lessThanButton);
        });
        panel.add(lessThanButton);

        JButton greaterThanButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/greaterthan.jpg"));
        greaterThanButton.setPreferredSize(new Dimension(200,100));
        greaterThanButton.setFont(new Font("Arial", Font.PLAIN, 30));
        greaterThanButton.addActionListener(e -> {
            greaterThanButton.setName("greaterThanButton");
            resetButtonClicked(greaterThanButton);
        });
        panel.add(greaterThanButton);

        JButton atTheRateButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/attherate.jpg"));
        atTheRateButton.setPreferredSize(new Dimension(200,100));
        atTheRateButton.setFont(new Font("Arial", Font.PLAIN, 30));
        atTheRateButton.addActionListener(e -> {
            atTheRateButton.setName("atTheRateButton");
            resetButtonClicked(atTheRateButton);
        });
        panel.add(atTheRateButton);

        JButton twoBarButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/twobars.jpg"));
        twoBarButton.setPreferredSize(new Dimension(200,100));
        twoBarButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoBarButton.addActionListener(e -> {
            twoBarButton.setName("twoBarButton");
            resetButtonClicked(twoBarButton);
        });
        panel.add(twoBarButton);

        JButton hyphenButton = new JButton(new ImageIcon("Team_08/src/ImageFiles/hyphen.jpg"));
        hyphenButton.setPreferredSize(new Dimension(200,100));
        hyphenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        hyphenButton.addActionListener(e -> {
            hyphenButton.setName("hyphenButton");
            resetButtonClicked(hyphenButton);
        });
        panel.add(hyphenButton);

    }
    private  void resetButtonClicked(JButton button){
        System.out.println(button.getName() + " clicked by the user!!!");
        switch (button.getName()) {
            case "openButton":
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "closeButton":
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.TRUE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "lessThanButton":
                LeftPanelMouseListener.setLessThanClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "greaterThanButton":
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "atTheRateButton":
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "twoBarButton":
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setHyphenClicked(Boolean.FALSE);
                break;
            case "hyphenButton":
                LeftPanelMouseListener.setHyphenClicked(Boolean.TRUE);
                LeftPanelMouseListener.setCloseBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setOpenBracketClicked(Boolean.FALSE);
                LeftPanelMouseListener.setLessThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setGreaterThanClicked(Boolean.FALSE);
                LeftPanelMouseListener.setAtTheRateClicked(Boolean.FALSE);
                LeftPanelMouseListener.setTwoBarsClicked(Boolean.FALSE);
                break;
            default:
                System.out.println("Wrong Input Entry From User!!!!!");
                break;
        }
    }
}
