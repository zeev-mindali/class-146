package com.jb.advanced_spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mishtaken {
    private int WinnersMeshapryDiur;
    private int WinnersHasryDiur;
    private int WinnersSeriesC;
    private int WinnersSeriesB;
    private int WinnersSeriesA;
    private int WinnersBneyMakom;
    private int Winners;
    private int SubscribersMeshapryDiur;
    private int SubscribersSeriesC;
    private int SubscribersSeriesB;
    private int SubscribersSeriesA;
    private int SubscribersBenyMakom;
    private int Subscribers;
    private int LotteryNativeHousingUnits;
    private int LotteryHousingUnits;
    private int LotterySignupNativeHousingUnits;
    private int LotterySignupHousingUnits;
    private String PriceForMeter;
    private String ConstructionPermitName;
    private String ProjectStatus;
    private String ProviderName;
    private String ProjectName;
    private int ProjectId;
    private String Neighborhood;
    private String LamasName;
    private int LamasCode;
    private Date LotteryExecutionDate;
    private Date LotteryEndSignupDate;
    private String LotteryStatusValue;
    private String Eligibility;
    private String MarketingRep;
    private String MarketingMethodDesc;
    private int MarketingMethod;
    private String CentralizationType;
    private String ContinLotteryId;
    private String ParentLotteryId;
    private String LotteryType;
    private int LotteryId;
}
