/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Dhiraj
 */
public class Sound {
    	public static final AudioClip BG = Applet.newAudioClip(Sound.class.getResource("\\music\\voice.wav"));
	public static final AudioClip SHOOT = Applet.newAudioClip(Sound.class.getResource("\\music\\shoot.wav"));
	public static final AudioClip BOOM = Applet.newAudioClip(Sound.class.getResource("\\music\\boom.wav"));
}
