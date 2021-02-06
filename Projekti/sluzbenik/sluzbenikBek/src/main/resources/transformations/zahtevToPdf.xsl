<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                exclude-result-prefixes="xs"
                version="2.0"
                xmlns:tipovi="http://tipovi"
                xmlns:zah="http://www.ftn.uns.ac.rs/zahtev"
>

    <xsl:variable name="space" select="'&#160;'"/>
    <xsl:variable name="comma" select="'&#44;'"/>
    <xsl:variable name="check" select="'&#2714;'"/>


    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="zahtev-page" page-height="29.7cm" page-width="21.0cm" margin="2.5cm 2.5cm 3cm 3cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="zahtev-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">

                    <!-- Ogran kome se upucuje -->
                    <fo:block text-align="center">
                        <fo:inline>
                            <xsl:value-of select="zah:Zahtev/zah:Primalac/zah:Organ/zah:Naziv"/>
                        </fo:inline>
                        <fo:inline>
                            <xsl:value-of select="$comma"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="zah:Zahtev/zah:Primalac/zah:Organ/zah:AdresaOrgana/zah:Mesto"/>
                            <xsl:value-of select="$comma"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="zah:Zahtev/zah:Primalac/zah:Organ/zah:AdresaOrgana/zah:Ulica"/>
                            <xsl:value-of select="$comma"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="zah:Zahtev/zah:Primalac/zah:Organ/zah:AdresaOrgana/zah:Broj"/>
                        </fo:inline>
                    </fo:block>
                    <fo:block text-align="center" margin-top="0px">
                        ------------------------------------------------------------------------------------------------------
                    </fo:block>
                    <fo:block text-align="center" margin-bottom="50px">
                        naziv i sedište organa kojem se zahtev upucuje
                    </fo:block>

                    <!-- Naslov -->
                    <fo:block text-align="center" font-weight="bold" font-size="14">
                        <xsl:variable name="naslov1" select="zah:Zahtev/zah:Sadrzaj/zah:Naslov"/>
                        <xsl:value-of select="substring($naslov1,1,11)"/>
                    </fo:block>
                    <fo:block text-align="center" font-weight="bold" font-size="14" margin-bottom="20px">
                        <xsl:variable name="naslov2" select="zah:Zahtev/zah:Sadrzaj/zah:Naslov"/>
                        <xsl:value-of select="substring($naslov2,13,52)"/>
                    </fo:block>

                    <!-- Paragraf -->
                    <fo:block text-indent="1em" margin-bottom="10px">
                        Na osnovu clana <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Paragraf/zah:Zakon/zah:Clan"/>.
                        st. <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Paragraf/zah:Zakon/zah:Stav"/>.
                        <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Paragraf/zah:Zakon/zah:Naziv"/>
                        („<xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Paragraf/zah:SluzbeniGlasnik/zah:Naziv"/>“,
                        <xsl:for-each select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Paragraf/zah:SluzbeniGlasnik/zah:Brojevi/zah:Broj">
                            <xsl:value-of select="."/>,
                        </xsl:for-each>
                        ), od gore navedenog organa zahtevam:*

<!--                        На основу члана 15. ст. 1. Закона о слободном приступу информацијама од јавног значаја-->
<!--                        („Службени гласник РС“, бр. 120/04, 54/07, 104/09 и 36/10), од горе наведеног органа захтевам:*-->
                    </fo:block>

                    <fo:block margin="auto auto auto 20px">
                        <fo:list-block >
                            <xsl:for-each select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:IzboriZahteva/zah:Izbor">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
<!--                                            <xsl:value-of select="$check"/>-->
                                            -
                                        </fo:block>
                                    </fo:list-item-label>

<!--                                    <xsl:element name="input">-->
<!--                                        <xsl:attribute name="type">radio</xsl:attribute> &lt;!&ndash; or checkbox &ndash;&gt;-->
<!--                                        <xsl:attribute name="name">needModeration</xsl:attribute>-->
<!--                                        <xsl:attribute name="value">true</xsl:attribute>-->
<!--                                        <xsl:if test="contains(needModeration,'true')"> &lt;!&ndash; just change this variable&ndash;&gt;-->
<!--                                            <xsl:attribute name="checked">-->
<!--                                            </xsl:attribute>-->
<!--                                        </xsl:if>-->
<!--                                    </xsl:element>-->
<!--                                    -->

                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>
                                            <xsl:if test="boolean(.[@Odabran='true'])">
                                                <xsl:value-of select="$check"/>
                                                <xsl:value-of select="$space"/>
<!--                                                <xsl:value-of select="$space"/>-->
<!--                                                <xsl:value-of select="$space"/>-->
<!--                                                <xsl:value-of select="$space"/>-->
<!--                                                <xsl:value-of select="$space"/>-->
<!--                                                <xsl:value-of select="$space"/>-->
<!--                                                &lt;&#45;&#45; Odabrano-->
                                            </xsl:if>
                                            <xsl:value-of select="."/>
                                        </fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:for-each>


                            <fo:list-item>
                                <fo:list-item-label end-indent="label-end()">
                                    <fo:block>-</fo:block>
                                </fo:list-item-label>

                                <fo:list-item-body start-indent="body-start()">
                                    <fo:block>
                                        Dostavljanje kopije dokumenta koji sadrzi trazenu informaciju:**
                                    </fo:block>
                                </fo:list-item-body>
                            </fo:list-item>
                        </fo:list-block>
                    </fo:block>

                    <fo:block margin="auto auto auto 40px">
                        <fo:list-block>
                            <xsl:for-each select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:IzboriZahteva/zah:IzboriDostave/zah:Izbor">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>-</fo:block>
                                    </fo:list-item-label>

                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>
                                            <xsl:if test="boolean(.[@Odabran='true'])">
                                                <xsl:value-of select="$check"/>
                                                <xsl:value-of select="$space"/>
<!--                                                    <xsl:value-of select="$space"/>-->
<!--                                                    <xsl:value-of select="$space"/>-->
<!--                                                    <xsl:value-of select="$space"/>-->
<!--                                                    <xsl:value-of select="$space"/>-->
<!--                                                    <xsl:value-of select="$space"/>-->
<!--                                                    &lt;&#45;&#45; Odabrano-->
                                            </xsl:if>
                                            <xsl:value-of select="."/>
                                        </fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:for-each>
                        </fo:list-block>
                    </fo:block>

                    <fo:block text-indent="1em" margin-top="20px">
                        Ovaj zahtev se odnosi na sledece informacije:
                        <fo:block text-decoration="underline">
                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:Informacije"/>
                        </fo:block>
                    </fo:block>
                    <fo:block font-size="9" margin-bottom="40px">
                        (navesti sto precizniji opis informacije koja se trazi, kao i druge podatke koji olaksavaju pronalazenje trazene informacije)
                    </fo:block>


                    <!-- Podaci o zahtevu -->
                    <fo:block>
                        <fo:table>
                            <fo:table-body>
                                <fo:table-row>
                                    <fo:table-cell text-align="left" margin-top="30px" margin-bottom="20px">
                                        <fo:block margin-top="30px">
                                            U
                                            <fo:inline text-decoration="underline">
                                                <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Mesto"/>
                                            </fo:inline>
                                            .
                                        </fo:block>
                                        <fo:block margin-top="20px">
                                            Dana

                                            <fo:inline text-decoration="underline">
                                                <xsl:variable name="datumPodnosenja" select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Datum"/>

                                                <xsl:value-of select="substring($datumPodnosenja,9,10)"/>

                                                <xsl:value-of select="$space"/>
                                                <xsl:value-of select="substring($datumPodnosenja,1,4)"/>
                                            </fo:inline>
                                            godine.


                                        </fo:block>
                                    </fo:table-cell>


                                    <fo:table-cell text-align="right">
                                        <fo:block text-decoration="underline" margin-top="10px">
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Ime"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Prezime"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="$space"/>
                                        </fo:block>

                                        <fo:block margin-bottom="10px">
                                            Trazilac informacije/Ime i prezime
                                        </fo:block>


                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Adresa/zah:Mesto"/>,
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Adresa/zah:Ulica"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Adresa/zah:Broj"/>
                                        </fo:block>

                                        <fo:block margin-bottom="10px">
                                            adresa
                                        </fo:block>


                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="zah:Zahtev/zah:Sadrzaj/zah:Telo/zah:PodaciOZahtevu/zah:Trazioc/zah:Kontakt"/>
                                        </fo:block>
                                        <fo:block margin-bottom="10px">
                                            drugi podaci za kontakt
                                        </fo:block>
                                    </fo:table-cell>

                                </fo:table-row>
                            </fo:table-body>
                        </fo:table>
                    </fo:block>

                    <fo:block margin-top="30px">
                        ___________________________________________________________________
                    </fo:block>
                    <fo:block font-size="9">
                        * Oznaciti koja zakonska preva na pristup informacijama zelite da ostvarite.
                    </fo:block>
                    <fo:block font-size="9">
                        ** Oznaciti nacin dostavljanja kopije dokumenata.
                    </fo:block>
                    <fo:block font-size="9">
                        *** Kada zahtevate drugi nacin dostavljanja obavezno upisati koji nacin dostavljanja zahtevate.
                    </fo:block>

                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

<!--    <xsl:template match="/">-->
<!--        <fo:root>-->
<!--            <fo:layout-master-set>-->
<!--                <fo:simple-page-master master-name="zahtev-page" page-height="29.7cm" page-width="21.0cm" margin="2cm">-->
<!--                    <fo:region-body/>-->
<!--                </fo:simple-page-master>-->
<!--            </fo:layout-master-set>-->

<!--            <fo:page-sequence master-reference="zahtev-page">-->
<!--                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">-->
<!--                    <fo:block text-decoration="underline" text-align="center">-->
<!--                        <xsl:value-of select="zah:Zahtev/zah:Organ_vlasti/tipovi:Naziv"/>-->
<!--                    </fo:block>-->

<!--                    <fo:block text-align="center" margin-bottom="50px">-->
<!--                        naziv i sedište organa kojem se zahtev upućuje-->
<!--                    </fo:block>-->
<!--                    <fo:block font-weight="bold" text-align="center">-->
<!--                        Z A H T E V-->
<!--                    </fo:block>-->
<!--                    <fo:block font-weight="bold" text-align="center" margin-bottom="30px">-->
<!--                        za pristup informacijama od javnog znacaja-->
<!--                    </fo:block>-->
<!--                    <fo:block text-indent="1em">-->
<!--                        Na osnovu clana <xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zakonska_osnova/zah:Clan"/>.-->
<!--                        st. <xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zakonska_osnova/zah:Stav"/>.-->
<!--                        <xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zakonska_osnova/zah:Zakon"/>.-->
<!--                        ("<xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zakonska_osnova/zah:Sluzbeni_glasnik/tipovi:Naziv"/>",-->
<!--                        <xsl:for-each select="zah:Zahtev/zah:Telo_zahteva/zah:Zakonska_osnova/zah:Sluzbeni_glasnik/tipovi:Brojevi/tipovi:Broj">-->
<!--                            <xsl:value-of select="."/>,-->
<!--                        </xsl:for-each>-->
<!--                        ), od gore navedenog organa zahtevam:-->
<!--                    </fo:block>-->
<!--                    <fo:block margin="auto auto auto 20px">-->
<!--                        <fo:list-block>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Obavestenje)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>obavestenje da li poseduje trazenu informaciju</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Uvid)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label  end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>uvid u dokument koji sadrzi trazenu informaciju</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Kopija)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>kopiju dokumenta koji sadrzi trazenu informaciju</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>dostavljanje kopije dokumenta koji sadrzi trazenu informaciju</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                        </fo:list-block>-->
<!--                    </fo:block>-->
<!--                    <fo:block margin="auto auto auto 40px">-->
<!--                        <fo:list-block>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije/zah:Nacin_dostave/zah:Dostava_postom)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>postom</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije/zah:Nacin_dostave/zah:Dostava_elektronskom_postom)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>elektronskom postom</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije/zah:Nacin_dostave/zah:Dostava_faksom)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>faksom</fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                            <xsl:if test="boolean(zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije/zah:Nacin_dostave/zah:Posebna_dostava)">-->
<!--                                <fo:list-item>-->
<!--                                    <fo:list-item-label end-indent="label-end()">-->
<!--                                        <fo:block>-->
<!--                                            <fo:inline font-family="Symbol">*</fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-label>-->
<!--                                    <fo:list-item-body start-indent="body-start()">-->
<!--                                        <fo:block>-->
<!--                                            na drugi nacin: <fo:inline text-decoration="underline">-->
<!--                                            <xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zahtevi/zah:Dostavljanje_kopije/zah:Nacin_dostave/zah:Posebna_dostava/zah:Nacin_posebne_dostave"/>-->
<!--                                        </fo:inline>-->
<!--                                        </fo:block>-->
<!--                                    </fo:list-item-body>-->
<!--                                </fo:list-item>-->
<!--                            </xsl:if>-->
<!--                        </fo:list-block>-->
<!--                    </fo:block>-->
<!--                    <fo:block text-indent="1em">-->
<!--                        Ovaj zahtev se odnosi na sledece informacije: <fo:inline text-decoration="underline">-->
<!--                        <xsl:value-of select="zah:Zahtev/zah:Telo_zahteva/zah:Zahtevane_informacije"/>-->
<!--                    </fo:inline>-->
<!--                    </fo:block>-->
<!--                    <fo:block font-size="10pt" margin-bottom="20px">-->
<!--                        (navesti sto precizniji opis informacije koja se trazi, kao i druge podatke koji olaksavaju pronalazenje trazene informacije)-->
<!--                    </fo:block>-->
<!--                    <fo:block>-->
<!--                        <fo:table>-->
<!--                            <fo:table-body>-->
<!--                                <fo:table-row>-->
<!--                                    <fo:table-cell text-align="left" margin-top="30px">-->
<!--                                        <fo:block>-->
<!--                                            U <fo:inline>-->
<!--                                            <xsl:value-of select="zah:Zahtev/@mesto"/>-->
<!--                                        </fo:inline>-->
<!--                                        </fo:block>-->
<!--                                        <fo:block>-->
<!--                                            <xsl:variable name="dt" select="zah:Zahtev/@datum"/>-->
<!--                                            <xsl:variable name="date" select="xs:date(concat(-->
<!--                                                substring($dt,1,4),'-',-->
<!--                                                substring($dt,6,2),'-',-->
<!--                                                substring($dt,9,2)))"/>-->
<!--                                            dana <xsl:value-of select="format-date($date,'[D].[M].[Y].')"/> godine-->
<!--                                        </fo:block>-->
<!--                                    </fo:table-cell>-->
<!--                                    <fo:table-cell text-align="right" margin-top="10px">-->
<!--                                        <xsl:choose>-->
<!--                                            <xsl:when test="boolean(zah:Zahtev/zah:Trazilac/tipovi:Naziv)">-->
<!--                                                <fo:block text-decoration="underline">-->
<!--                                                    <xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Naziv"/>-->
<!--                                                </fo:block>-->
<!--                                            </xsl:when>-->
<!--                                            <xsl:otherwise>-->
<!--                                                <fo:block text-decoration="underline">-->
<!--                                                    <xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Ime"/><xsl:value-of select="$space"/><xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Prezime"/>-->
<!--                                                </fo:block>-->
<!--                                            </xsl:otherwise>-->
<!--                                        </xsl:choose>-->
<!--                                        <fo:block margin-bottom="10px">-->
<!--                                            Trazilac informacije/Ime i prezime-->
<!--                                        </fo:block>-->
<!--                                        <fo:block text-decoration="underline">-->
<!--                                            <xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Adresa/tipovi:Ulica"/><xsl:value-of select="$space"/><xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Adresa/tipovi:Ulicni_broj"/>,<xsl:value-of select="$space"/>-->
<!--                                            <xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Adresa/tipovi:Mesto"/>-->
<!--                                        </fo:block>-->
<!--                                        <fo:block margin-bottom="10px">-->
<!--                                            adresa-->
<!--                                        </fo:block>-->
<!--                                        <fo:block text-decoration="underline">-->
<!--                                            <xsl:value-of select="zah:Zahtev/zah:Trazilac/tipovi:Kontakt_podaci"/>-->
<!--                                        </fo:block>-->
<!--                                        <fo:block>-->
<!--                                            drugi podaci za kontakt-->
<!--                                        </fo:block>-->
<!--                                    </fo:table-cell>-->
<!--                                </fo:table-row>-->
<!--                            </fo:table-body>-->
<!--                        </fo:table>-->
<!--                    </fo:block>-->
<!--                </fo:flow>-->
<!--            </fo:page-sequence>-->
<!--        </fo:root>-->
<!--    </xsl:template>-->

</xsl:stylesheet>