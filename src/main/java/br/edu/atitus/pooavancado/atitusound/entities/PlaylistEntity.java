package br.edu.atitus.pooavancado.atitusound.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class PlaylistEntity {
	
	private boolean publicShare;
	
	@ManyToMany
	@JoinTable(name = "tb_playlist_music",
			joinColumns = @JoinColumn(name = "playlist_uuid"),
			inverseJoinColumns = @JoinColumn(name = "music_uuid"))
	private List<MusicEntity> musics;

	public boolean isPublicShare() {
		return publicShare;
	}

	public void setPublicShare(boolean publicShare) {
		this.publicShare = publicShare;
	}
}
