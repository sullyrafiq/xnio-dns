/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.xnio.dns;

/**
 *
 */
public enum RRType {

    /** {@rfc 1035} */
    A(1),
    /** {@rfc 1035} */
    NS(2),
    /**
     * @deprecated use {@link #MX}
     */
    @Deprecated
    MD(3),
    /**
     * @deprecated use {@link #MX}
     */
    @Deprecated
    MF(4),
    /** {@rfc 1035} */
    CNAME(5),
    /** {@rfc 1035} */
    SOA(6),
    /** {@rfc 1035} */
    MB(7),
    /** {@rfc 1035} */
    MG(8),
    /** {@rfc 1035} */
    MR(9),
    /** {@rfc 1035} */
    NULL(10),
    /** {@rfc 1035} */
    KWS(11),
    /** {@rfc 1035} */
    PTR(12),
    /** {@rfc 1035} */
    HINFO(13),
    /** {@rfc 1035} */
    MINFO(14),
    /** {@rfc 1035} */
    MX(15),
    /** {@rfc 1035} */
    TXT(16),
    /** {@rfc 1183} */
    RP(17),
    /** {@rfc 1183} */
    AFSDB(18),
    /** {@rfc 1183} */
    X25(19),
    /** {@rfc 1183} */
    ISDN(20),
    /** {@rfc 1183} */
    RT(21),
    /** {@rfc 1706} */
    NSAP(22),
    /** {@rfc 1348} */
    NSAP_PTR(23),
    /** {@rfc 4034}, {@rfc 3755}, {@rfc 2535} */
    SIG(24),
    /** {@rfc 4034}, {@rfc 3755}, {@rfc 2535} */
    KEY(25),
    /** {@rfc 2163} */
    PX(26),
    /** {@rfc 1712} */
    GPOS(27),
    /** {@rfc 3596} */
    AAAA(28),
    /** {@rfc 1876} */
    LOC(29),
    @Deprecated
    NXT(30),
    EID(31),
    NIMLOC(32),
    /** {@rfc 2782} */
    SRV(33),
    ATMA(34),
    /** {@rfc 2915} {@rfc 2168} */
    NAPTR(35),
    /** {@rfc 2230} */
    KX(36),
    /** {@rfc 2538} */
    CERT(37),
    /** {@rfc 3226} {@rfc 2874} */
    A6(38),
    /** {@rfc 2672} */
    DNAME(39),
    SINK(40),
    /** {@rfc 2671} */
    OPT(41),
    /** {@rfc 3123} */
    APL(42),
    /** {@rfc 3658} */
    DS(43),
    /** {@rfc 4255} */
    SSHFP(44),
    /** {@rfc 4025} */
    IPSECKEY(45),
    /** {@rfc 4034} {@rfc 3755} */
    RRSIG(46),
    /** {@rfc 4034} {@rfc 3755} */
    NSEC(47),
    /** {@rfc 4034} {@rfc 3755} */
    DNSKEY(48),
    /** {@rfc 4701} */
    DHCID(49),
    /** {@rfc 5155} */
    NSEC3(50),
    /** {@rfc 5155} */
    NSEC3PARAM(51),
    /** {@rfc 5205} */
    HIP(55),
    NINFO(56),
    RKEY(57),
    /** {@rfc 4408} */
    SPF(99),
    UINFO(100),
    UID(101),
    GID(102),
    UNSPEC(103),
    /** {@rfc 2930} */
    TKEY(249),
    /** {@rfc 2845} */
    TSIG(250),
    /** {@rfc 1995} */
    IXFR(251),
    /** {@rfc 1035} */
    AXFR(252),
    /** {@rfc 1035} */
    MAILB(253),
    /**
     * @deprecated use {@link #MX}
     */
    @Deprecated
    MAILA(254),
    /** {@rfc 1035} */
    ANY(255),
    TA(32768),
    DLV(32769);
    private final int id;

    RRType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}