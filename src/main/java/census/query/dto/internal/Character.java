package census.query.dto.internal;

import census.anatomy.Collection;
import census.query.dto.CensusCollectionImpl;
import census.query.dto.util.BattleRank;
import census.query.dto.util.Certs;
import census.query.dto.util.DailyRibbon;
import census.query.dto.util.Name;
import census.query.dto.util.Times;

public class Character extends CensusCollectionImpl {

	private String character_id;
	private Name name;
	private String faction_id;
	private String head_id;
	private String title_id;
	private Times times;
	private Certs certs;
	private BattleRank battle_rank;
	private String profile_id;
	private DailyRibbon daily_ribbon;
	private String prestige_level;
	
	public Character() {
		super(Collection.CHARACTER);
		
	}

	public String getCharacter_id() {
		return character_id;
	}

	public void setCharacter_id(String character_id) {
		this.character_id = character_id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getFaction_id() {
		return faction_id;
	}

	public void setFaction_id(String faction_id) {
		this.faction_id = faction_id;
	}

	public String getHead_id() {
		return head_id;
	}

	public void setHead_id(String head_id) {
		this.head_id = head_id;
	}

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public Times getTimes() {
		return times;
	}

	public void setTimes(Times times) {
		this.times = times;
	}

	public Certs getCerts() {
		return certs;
	}

	public void setCerts(Certs certs) {
		this.certs = certs;
	}

	public BattleRank getBattle_rank() {
		return battle_rank;
	}

	public void setBattle_rank(BattleRank battle_rank) {
		this.battle_rank = battle_rank;
	}

	public String getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public DailyRibbon getDaily_ribbon() {
		return daily_ribbon;
	}

	public void setDaily_ribbon(DailyRibbon daily_ribbon) {
		this.daily_ribbon = daily_ribbon;
	}

	public String getPrestige_level() {
		return prestige_level;
	}

	public void setPrestige_level(String prestige_level) {
		this.prestige_level = prestige_level;
	}

	@Override
	public String toString() {
		return "Character [character_id=" + character_id + ", name=" + name + ", faction_id=" + faction_id
				+ ", head_id=" + head_id + ", title_id=" + title_id + ", times=" + times + ", certs=" + certs
				+ ", battle_rank=" + battle_rank + ", profile_id=" + profile_id + ", daily_ribbon=" + daily_ribbon
				+ ", prestige_level=" + prestige_level + ", nestedCollections=" + nestedCollections + ", collection="
				+ collection + "]";
	}

	

	
}
