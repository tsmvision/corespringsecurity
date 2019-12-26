package io.security.corespringsecurity.security.service;

import io.security.corespringsecurity.domain.entity.Account;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AccountContext extends User {
  private Account account;

  public AccountContext(Account account) {
    super(account.getUsername(), account.getPassword(), null);
    this.account = account;
  }
}
