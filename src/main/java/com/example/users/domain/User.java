package com.example.users.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "user",schema="public")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * You can generate your sequence from @SequenceGenerator, here sequenceName will create a new sequence.
	 * If you want to use your already created sequence then provide only @GeneratedValue, here in generator provide the sequence that is already created.
	 */
	
	/*
	 * @GeneratedValue are also called identifiers in Hibernate/JPA. Identifiers in Hibernate represent the primary key of an entity
	 */
	@Id()
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_generator")
	//@SequenceGenerator(name="sequence_generator", sequenceName = "sequence2", schema="public")
	@GeneratedValue(generator = "sequence1")
    @Column(name = "user_id")
    private Long userId;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_userpassword")
	private String password;
	
	@Embedded
	@ElementCollection
	@JoinTable (name="USER_ADDRESS", joinColumns=
        @JoinColumn(name="address_user_id", referencedColumnName="user_id"))
	
	@GenericGenerator(name="increment-gen", strategy = "increment")
	@CollectionId(columns= {@Column(name="ADDRESS_ID")}, generator = "increment-gen", type = @Type(type="long"))
	private List<Address> userAddrsses;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Address> getUserAddrsses() {
		return userAddrsses;
	}
	public void setUserAddrsses(List<Address> userAddrsses) {
		this.userAddrsses = userAddrsses;
	}
}
