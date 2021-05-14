package com.cardtype;

import org.springframework.stereotype.Service;

@Service
public interface CardNo {

	String getCardType(long cardNo);

}
